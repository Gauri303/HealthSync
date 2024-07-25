package com.example.demo;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean<LoginServlet> servletRegistrationBean() {
        ServletRegistrationBean<LoginServlet> bean = new ServletRegistrationBean<>(new LoginServlet(), "/login");
        return bean;
    }
}
