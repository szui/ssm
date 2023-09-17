package com.szui.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Author:szui
 * @Date:2023/9/14 11:28
 * @Description:
 */
@Configuration
public class SpringMvcSuppot extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages");
        registry.addResourceHandler("/css/**").addResourceLocations("/css");
        registry.addResourceHandler("/js/**").addResourceLocations("/js");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins");

    }

}
