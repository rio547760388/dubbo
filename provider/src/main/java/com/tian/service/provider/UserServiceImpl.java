package com.tian.service.provider;

import com.tian.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author ﻿rio
 * @since 2020/5/1
 */
@Slf4j
@Service(/*version = "1.0"*/)
public class UserServiceImpl implements UserService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Autowired
    RabbitSender rabbitSender;

    @Override
    public String getUserById(Long id) {
        log.info("新请求：{}", id);
        rabbitSender.orderComing(id);
        return "Hello dubbo " + id;
    }

}
