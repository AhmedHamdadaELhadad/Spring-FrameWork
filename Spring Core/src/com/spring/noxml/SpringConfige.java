package com.spring.noxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySource("classpath:data.properties")
@ComponentScan("com.spring.noxml")

public class SpringConfige {

}
