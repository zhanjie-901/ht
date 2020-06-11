package com.ht.controller;

import com.ht.bean.Emp;
import com.ht.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private IEmpService is;

    @RequestMapping("/toempAdd")
    public String toempAdd(){

        return "emp/empAdd";
    }


    @RequestMapping("/list")
    public String list(Model model){
       List<Emp> list = is.selAll();
       System.out.println("list.size() = " + list.size());
       model.addAttribute("list",list);
       return  "emp/empList";
    }

    @RequestMapping("/add")
    public String add(Emp emp){
        emp.setPassword("123456");
        int i = is.insert(emp);
        System.out.println("i = " + i);
        return "redirect:list";
    }

    @RequestMapping("/del")
    public String del(int empid){
        int  i = is.del(empid);
        return "redirect:list";
    }

    @RequestMapping("/toupd")
    public String toupd(int id, Model model){
        Emp emp =is.selById(id);
        model.addAttribute("emp",emp);
        return "emp/empUpd";
    }

    @RequestMapping("/update")
    public String update(Emp emp){
        int i = is.upd(emp);
        System.out.println("返回值" + i);
        return "redirect:list";
    }
}
