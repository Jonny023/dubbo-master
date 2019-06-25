package com.jonny.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author Lee
 * @Description
 * @Date 2019年06月24日 22:58
 */
public class ProviderDemo {

    public static void main(String[] args) {
        // 发布服务
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
