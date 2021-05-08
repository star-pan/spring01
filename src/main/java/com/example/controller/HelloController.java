package com.example.controller;

import com.example.entity.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private Resource resource;
    @RequestMapping("/hello")
    public Object hello(){
        return "hello springboot~";
    }
    @RequestMapping("/getResource")
    public String getResource(){
        return resource.toString();
    }
}
