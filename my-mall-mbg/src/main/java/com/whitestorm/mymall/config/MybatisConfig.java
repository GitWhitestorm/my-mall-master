package com.whitestorm.mymall.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.whitestorm.mymall.mapper")
public class MybatisConfig {
}
