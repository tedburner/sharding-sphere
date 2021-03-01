package com.sharding.sphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * @author : Arthas
 * @description: sharding sphere 分库分表
 * */
@SpringBootApplication
@MapperScan("com.sharding.sphere.persist")
public class SphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(SphereApplication.class, args);
    }

}
