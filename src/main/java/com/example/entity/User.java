package com.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

public class User {
    private String name;
    @JsonIgnore //忽略该字段数据
    private int age;
    private String sex;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a",locale = "zh",timezone = "GMT+8")
    private Date birthday;
    @JsonInclude(JsonInclude.Include.NON_NULL) //允许为空，为空的时候没有数据
    private String desc;

    public User() {
    }

    public User(String name, int age, String sex, Date birthday, String desc) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", desc='").append(desc).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
