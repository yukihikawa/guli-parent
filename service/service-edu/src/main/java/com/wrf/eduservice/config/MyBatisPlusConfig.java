package com.wrf.serviceedu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: guli-parent
 * @description: 配置类
 * @author: WRF
 * @create: 2022-06-14 15:31
 **/
@Configuration@EnableTransactionManagement
@MapperScan("com.wrf.serviceedu.mapper")
public class MyBatisPlusConfig {
}
