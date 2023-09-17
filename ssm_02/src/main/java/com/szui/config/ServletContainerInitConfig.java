package com.szui.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @Author:szui
 * @Date:2023/9/13 15:02
 * @Description:
 */

/*定义一个Servlet容器启动的配置类，在里边加载spring配置*/
public class ServletContainerInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*加载spring的配置类*/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /*加载springmvc的配置类*/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    /*拦截springmvc的请求*/
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


}



///*定义一个Servlet容器启动的配置类，在里边加载spring配置*/
//public class ServletContainerInitConfig extends AbstractDispatcherServletInitializer {
//    /*加载springmvc容器配置*/
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        /*将配置类中的配置加载过来*/
//        context.register(SpringMvcConfig.class);
//        return context;
//    }
//
//    /*设置哪些请求归属springmvc处理*/
//    @Override
//    protected String[] getServletMappings() {
//
//        /*就是所有的请求都由springmvc管理*/
//        return new String[]{"/"};
//    }
//
//    /*加载spring容器配置*/
//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        return null;
//    }
//}