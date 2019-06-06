package com.sharding.sphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

@SpringBootApplication(exclude = JtaAutoConfiguration.class)
public class SphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(SphereApplication.class, args);
    }

}
