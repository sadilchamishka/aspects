package com.sample.profileapi.profileapi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sample.profileapi","net.cake.apiwatch.*"})
public class Profileapi1Application {

    public static void main(String[] args) {
        SpringApplication.run(Profileapi1Application.class, args);
    }

}
