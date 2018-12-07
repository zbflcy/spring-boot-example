package springboot.example.Config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by curry on 18-12-7.
 */
@Configuration
public class DuridConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource duridDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }


    //配置druid的监控
    //配置一个管理后台的servlet

    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean<StatViewServlet>(new StatViewServlet(), "/druid/*");

        Map<String, String> map = new HashMap<>();

//        public static final String SESSION_USER_KEY = "druid-user";
//        public static final String PARAM_NAME_USERNAME = "loginUsername";
//        public static final String PARAM_NAME_PASSWORD = "loginPassword";
//        public static final String PARAM_NAME_ALLOW = "allow";
//        public static final String PARAM_NAME_DENY = "deny";

        map.put("loginUsername", "admin");
        map.put("loginPassword", "1202");
        map.put("allow", "");//默认允许所有
//        map.put("deny","")
        bean.setInitParameters(map);
        return bean;
    }


    //配置一个监控的filter


    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean<WebStatFilter> webStatFilterFilterRegistrationBean = new FilterRegistrationBean<>(new WebStatFilter());
        Map<String, String> map = new HashMap<>();
        webStatFilterFilterRegistrationBean.setInitParameters(map);

        map.put("exclusions", "*.js,*.css,/druid/*");

        webStatFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return webStatFilterFilterRegistrationBean;
    }


}
