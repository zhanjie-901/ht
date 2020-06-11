package com.ht.controller;


import com.ht.bean.Emp;
import com.ht.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/ht")
public class test {
    @Resource
    private EmpService emp;

    @RequestMapping("/tologin")
    public String tologin(){
        return "/login";
    }
    @RequestMapping("/index")
    public String index(Emp em,Model model){
        Emp uesr= emp.login(em);
        //System.out.println(uesr.toString());
        ModelAndView mv=new ModelAndView();
        if(!(user().isEmpty())){
            model.addAttribute("article", uesr);
            return "/index";
        }else{
            return "/login";
        }

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
