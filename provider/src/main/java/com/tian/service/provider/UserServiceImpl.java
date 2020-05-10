package com.tian.service.provider;

import com.tian.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author ﻿rio
 * @date 2020/5/1
 */
@Service(/*version = "1.0"*/)
public class UserServiceImpl implements UserService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String getUserById(Long id) {
        return "Hello dubbo " + id;
    }

}
