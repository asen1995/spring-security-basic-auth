package com.asen.springsecuritybasicauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityBasicAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityBasicAuthApplication.class, args);
    }

}
