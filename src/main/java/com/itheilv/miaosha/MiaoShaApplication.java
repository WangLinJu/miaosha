package com.itheilv.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author WSQ
 * @since 2020-10-16
 */
@SpringBootApplication
@MapperScan("com.itheilv.miaosha.mapper")
public class MiaoShaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiaoShaApplication.class, args);
    }
}
