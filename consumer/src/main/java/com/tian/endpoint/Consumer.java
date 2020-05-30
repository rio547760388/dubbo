package com.tian.endpoint;

import com.tian.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ﻿rio
 * @since 2020/5/10
 * 说明：
 */
@Slf4j
@RestController
public class Consumer {

    @Reference(/*version = "1.0", lazy = true, check = false, url = "dubbo://172.18.91.177:8080"*/
        loadbalance = "roundrobin"
    )
    private UserService userService;

    @GetMapping("index")
    public String hello() {
        log.info("请求 /hello");
        return userService.getUserById(1L);
    }
}
