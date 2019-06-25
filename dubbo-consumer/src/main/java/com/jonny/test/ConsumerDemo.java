package com.jonny.test;

import com.alibaba.fastjson.JSONObject;
import com.jonny.bean.entity.User;
import com.jonny.consumer.UserConsumer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author Lee
 * @Description
 * @Date 2019年06月24日 23:04
 */
public class ConsumerDemo {

    public static void main(String[] args) throws Exception {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
//        UserService userService = (UserService)context.getBean("userService"); // 获取远程服务代理
//        context.start();
//        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(Consumer.class);
//        List<User> users = userService.getAllUser(); // 执行远程方法

        // 用户消费
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        UserConsumer consumer = (UserConsumer)context.getBean("userConsumer"); // 获取远程服务代理
        System.out.println(consumer);
        System.out.println("=============");
        List<User> users = consumer.getAll();


        System.out.println(JSONObject.toJSONString(users)); // 显示调用结果
        System.in.read();
    }

}
