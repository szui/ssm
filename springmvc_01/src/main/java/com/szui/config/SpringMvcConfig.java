package com.szui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:szui
 * @Date:2023/9/13 15:02
 * @Description:
 */

/*
* 需要扫描到包
*/
@Configuration
@ComponentScan("com.szui.controller")
public class SpringMvcConfig {
}
