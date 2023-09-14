package com.szui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:szui
 * @Date:2023/9/13 15:43
 * @Description:
 */
@Configuration
@ComponentScan({"com.szui.service","com.szui.dao"})
public class SpringConfig {
}
