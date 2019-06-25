package com.jonny.service;

import com.jonny.bean.entity.User;

import java.util.List;

/**
 * @Author Lee
 * @Description
 * @Date 2019年06月24日 22:42
 */
public interface UserService {

    String hello(String msg);

    List<User> getAllUser();
}
