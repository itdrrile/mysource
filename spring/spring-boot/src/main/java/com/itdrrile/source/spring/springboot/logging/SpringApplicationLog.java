package com.itdrrile.source.spring.springboot.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class SpringApplicationLog extends SpringApplication {

    @Override
    protected void logStartupInfo(boolean isRoot) {
        super.logStartupInfo(isRoot);
    }
}
