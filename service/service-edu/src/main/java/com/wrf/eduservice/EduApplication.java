package com.wrf.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: guli-parent
 * @description: 启动类
 * @author: WRF
 * @create: 2022-06-14 15:40
 **/
@SpringBootApplication
@ComponentScan(basePackages = {"com.wrf"})
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class, args);
    }
}
