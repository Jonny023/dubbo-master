package com.jonny.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jonny.bean.entity.User;
import com.jonny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Lee
 * @Description
 * @Date 2019年06月25日 0:23
 */
@Component(value = "userConsumer")
public class UserConsumer {

    // 指定版本，这里用随机（升级可以用这种方式）
    @Reference(version = "*")
    private UserService userService;

    public List<User> getAll() {
        System.out.println(userService);
        return userService.getAllUser();
    }
}