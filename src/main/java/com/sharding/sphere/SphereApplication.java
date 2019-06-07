package com.sharding.sphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

/***
 * @author : Arthas
 * @description: sharding sphere 分库分表
 * */
@SpringBootApplication(exclude = JtaAutoConfiguration.class)
public class SphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(SphereApplication.class, args);
    }

}
