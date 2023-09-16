package com.szui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author:szui
 * @Date:2023/9/16 14:44
 * @Description:SpringMvc模式下的Spring配置文件
 */

@Configuration
@ComponentScan("com.szui")
@EnableAspectJAutoProxy
public class SpringConfig {
}
