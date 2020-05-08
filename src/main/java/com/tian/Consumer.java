package com.tian;

import com.tian.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ﻿rio
 * @date 2020/5/1
 * 说明：
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:/dubbo-consumer.xml"});
        context.start();
        UserService userService = (UserService) context.getBean("demoService");
        String user = userService.getUserById(2L);
        System.out.println(user);
    }
}
