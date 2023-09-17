package com.szui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author:szui
 * @Date:2023/9/13 15:43
 * @Description:
 */
@Configuration
@ComponentScan({"com.szui.service","com.szui.dao"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
