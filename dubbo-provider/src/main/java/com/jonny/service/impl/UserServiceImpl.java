package com.jonny.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jonny.bean.entity.User;
import com.jonny.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Lee
 * @Description user实现类
 * @Date 2019年06月24日 22:53
 */
@Service(version = "1.0")
public class UserServiceImpl implements UserService {

    public String hello(String msg) {
        return "hello，" + msg;
    }

    public List<User> getAllUser() {
        System.out.println("服务1");
        List<User> lists = Arrays.asList(
                new User(1, "小王", "男"),
                new User(2, "小舞", "女"),
                new User(3, "小奥", "男"),
                new User(4, "小青", "女"),
                new User(5, "小芳", "女")
        );
        return lists;
    }
}