package com.song.dream.starter;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName DreamApplication
 * @Description
 * @Author songzhiquana
 * @Date 17:57 2023/9/13
 * @Version 1.0
 **/
@SpringBootApplication(scanBasePackages = {"com.song.dream"})
@MapperScan(value = {"com.song.dream.dal.mapper"})
public class DreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(DreamApplication.class, args);
    } 
}
