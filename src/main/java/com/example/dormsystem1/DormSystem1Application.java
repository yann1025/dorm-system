package com.example.dormsystem1;   // ← 用 IDEA 创建的真实包名

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dormsystem1.mapper")   // ← 加 1
public class DormSystem1Application {            // ← 类名带 1
    public static void main(String[] args) {
        SpringApplication.run(DormSystem1Application.class, args);  // ← 带 1
    }
}