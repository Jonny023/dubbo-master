package com.jonny.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jonny.bean.entity.User;
import com.jonny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author Lee
 * @Description
 * @Date 2019年06月24日 23:39
 */
@Controller
public class UserController {

    @Reference
    private UserService userService;

    @ResponseBody
    @RequestMapping("/user/get")
    public List<User> get() {
        return userService.getAllUser();
    }
}
