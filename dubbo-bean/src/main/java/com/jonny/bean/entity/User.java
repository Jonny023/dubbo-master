package com.jonny.bean.entity;

import java.io.Serializable;

/**
 * @Author Lee
 * @Description 用户类
 * @Date 2019年06月24日 23:18
 */
public class User implements Serializable {

    private String username;

    private int id;

    private String sex;

    public User() {
    }

    public User(int id, String username, String sex) {
        this.id = id;
        this.username = username;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
