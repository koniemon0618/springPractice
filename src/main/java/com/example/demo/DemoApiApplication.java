package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApiApplication {
 
    public static void main(String[] args) {
        ApplicationContext appConfig = new AnnotationConfigApplicationContext(AppConfig.class);
        SpringApplication.run(DemoApiApplication.class, args);
    }
}

//@SpringBootApplication
//public class DemoApiApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(DemoApiApplication.class, args);
//	}
//
//}
