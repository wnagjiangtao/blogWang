package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@MapperScan("com.wang.mapper")
public class WangBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(WangBlogApplication.class, args);
    }
}
