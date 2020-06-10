package com.ht.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/ht")
public class test {

    @RequestMapping("/tologin")
    public String tologin(){
        return "/login";
    }
    @RequestMapping("/index")
    public String index(){
        return "/index";
    }
    @RequestMapping("/register")
    public String register(){
        return "/register";
    }
    @RequestMapping("/forget")
    public String forget(){
        return "/forget";
    }
    @RequestMapping("/console")
    public String console(){
        return "/console";
    }
    @RequestMapping("/user")
    public String user(){
        return "/member/user";
    }
    @RequestMapping("/userinfo")
    public String userinfo(){
        return "/member/user-info";
    }
    @RequestMapping("/userpwd")
    public String userpwd(){
        return "/member/user-pwd";
    }



}
