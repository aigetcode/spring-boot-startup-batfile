package com.runbatfile.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RunbatfileApplication extends SpringBootServletInitializer {

    protected static ConfigurableApplicationContext context;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RunbatfileApplication.class);
    }

    public static void main(String[] args) {
        context = SpringApplication.run(RunbatfileApplication.class, args);
    }

}
