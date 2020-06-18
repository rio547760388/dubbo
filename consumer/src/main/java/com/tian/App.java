package com.tian;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ﻿rio
 * @since 2020/5/9
 * 说明：
 */
@SpringBootApplication
@EnableRabbit
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

    }
}
