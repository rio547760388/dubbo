package com.tian.service.provider;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.tian.service.UserService;

import java.util.Map;

/**
 * @author ﻿rio
 * @date 2020/5/1
 */
public class UserServiceImpl implements UserService {
    Map<Long, String> users = Maps.toMap(
            Lists.newArrayList(1L , 2L, 3L),
            (num) -> "num" + num
    );

    @Override
    public String getUserById(Long id) {
        return users.get(id);
    }

    public static void main(String[] a) {
        System.out.println("ok");
        UserServiceImpl userService = new UserServiceImpl();
        System.out.println(userService.getUserById(2L));
        System.out.println(userService.users);
    }
}
