package com.jqc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //eureka服务端注解
public class EurekaServer7002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class,args);
        System.out.print("测试gitHub");
        System.out.print("测试gitHub");
    }

}
