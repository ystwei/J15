package com.weikun.po;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/9.
 */
public class User implements Serializable{
    public User(String username) {
        this.username = username;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
