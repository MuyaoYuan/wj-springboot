package config;

import my.study.controller.LoginController;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootConfiguration
public class MyWebConfigurer implements WebMvcConfigurer {
    @Bean
    public LoginController getLoginController(){
        return new LoginController();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor((HandlerInterceptor) getLoginController()).addPathPatterns("/**").excludePathPatterns("/index.html");
    }
}
