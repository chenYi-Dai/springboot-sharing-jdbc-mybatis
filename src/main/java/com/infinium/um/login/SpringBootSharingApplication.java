package com.infinium.um.login;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@MapperScan({"com.infinium.um.login.dao"})
@SpringBootApplication(scanBasePackages = {"com.infinium.um"})
public class SpringBootSharingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSharingApplication.class, args);
    }
}
