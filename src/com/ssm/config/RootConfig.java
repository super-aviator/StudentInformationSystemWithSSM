package com.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//@ContextConfiguration("WEB-INF/applicationContext.xml")
@ComponentScan(basePackages = "com.ssm",
        excludeFilters = {
                @ComponentScan.Filter(type= FilterType.ANNOTATION,value = EnableWebMvc.class)
        })
public class RootConfig {

}
