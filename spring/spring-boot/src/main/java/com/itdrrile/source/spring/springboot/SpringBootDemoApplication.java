package com.itdrrile.source.spring.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.availability.ApplicationAvailability;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringBootDemoApplication.class, args);
        SpringApplication springApplication = new SpringApplication(SpringBootDemoApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);

    }
}
