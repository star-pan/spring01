package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;

/**
 * @RestController是SpringBoot新增的注解
 * @RestController=@Controller+@ResponseBody
 */
@RestController
//@Controller //这是传统的spring注解
public class UserController {
    @RequestMapping("/getUser")
    //@ResponseBody   //将服务器响应的数据以json的格式返回
    public Object getUser(){
        //User user=new User("张三",18,"男",new Date(),"美男子");
        User u=new User();
        u.setName("哈哈");
        u.setBirthday(new Date());
        u.setSex("女");
        u.setAge(18);
        u.setDesc("hello 123 ~~");
        return u;
    }
    @RequestMapping("/ok")
    public String ok(Object data){
        int status=200;
        String msg="ok";
        return status+msg+getUser();
    }
}
