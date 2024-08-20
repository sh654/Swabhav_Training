package com.techlabs.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.techlabs.model")
public class Config {
    // No need to manually define beans if using @ComponentScan
}
