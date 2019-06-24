package com.yinhai.springbootdubbo.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {

    private String id;
    private String name;
    private  String sex;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
