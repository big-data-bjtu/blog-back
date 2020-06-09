package com.bigdata.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController  {


    @GetMapping("/")
    public Object main(){
        return "hello world";
    }



}
