package springboot.example.webcrud.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        registry.addViewController("/curry").setViewName("success");
    }


//    @Bean
//    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
//        return new WebMvcConfigurerAdapter() {
//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
////                super.addInterceptors(registry);
//                registry.addInterceptor(new MainInteceptor()).addPathPatterns("/**")
//                        .excludePathPatterns("/", "/index", "/index.html").excludePathPatterns("/user/login");
//            }
//        };
//    }

    @Bean
    public WebMvcConfigurerAdapter getWecConfigurerAdapter() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
//                super.addViewControllers(registry);
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index").setViewName("index");
                registry.addViewController("/login").setViewName("index");
                registry.addViewController("/main.html").setViewName("dashboard");
                registry.addViewController("/main").setViewName("dashboard");

            }

        };
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }


}
