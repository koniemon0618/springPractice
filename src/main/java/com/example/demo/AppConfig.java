package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
     
    @Bean
    String stringBean() {
        return new String("DI対象");
    }
     
}
