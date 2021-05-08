package com.example.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//设置该类字段与资源文件的数据映射
@Configuration //代表需要扫描配置文件
@ConfigurationProperties(prefix = "com.example.opensource") //设置资源文件的前缀，后面会作为属性映射
@PropertySource(value = "classpath:resource.properties") //设置资源文件路径，classpath代表类路径
public class Resource {
    private String name;
    private int age;
    private String sex;

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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Resource{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", sex='").append(sex).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
