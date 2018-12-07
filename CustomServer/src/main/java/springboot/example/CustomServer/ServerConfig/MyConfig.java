package springboot.example.CustomServer.ServerConfig;

import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.example.CustomServer.Filter.MyFilter;
import springboot.example.CustomServer.Listener.MyListener;
import springboot.example.CustomServer.Servlet.MyServlet;

import java.util.Arrays;

//@Configuration
public class MyConfig {


    /**
     * 自定义 嵌入的web server
     *
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer webServerFactoryCustomizer() {
        return new WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>() {
            @Override
            public void customize(ConfigurableServletWebServerFactory server) {
                server.setPort(9000);
                server.setContextPath("/curry");
            }
        };
    }


    /**
     * \
     * 添加自己的 servlet
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean<MyServlet>(new MyServlet(), "/myserlvet");
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean<MyFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>(new MyFilter());
        filterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/myserlvet"));
        return filterFilterRegistrationBean;
    }


    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        return new ServletListenerRegistrationBean<MyListener>(new MyListener());
    }


}
