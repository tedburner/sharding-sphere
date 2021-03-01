package com.sharding.sphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/***
 * @author : lingjun.jlj
 * @description: sharding sphere 分库分表
 * */
@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class SphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(SphereApplication.class, args);
    }

}
