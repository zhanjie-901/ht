package com.ht.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ht.bean.StudentFloor;
import com.ht.service.IStudentFloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/studentFloor")
public class studentFloorController {
    @Autowired
    private IStudentFloorService is;

    @RequestMapping("/list")
    @ResponseBody
    public Map<String, Object> list(@RequestParam(required = false, defaultValue = "1") int page,
                                    @RequestParam(required = false) int limit){
        // 使用Pagehelper传入当前页数和页面显示条数会自动为我们的select语句加上limit查询(分页)插件
        System.out.println("limit = " + limit);
        PageHelper.startPage(page,limit);
        List<StudentFloor> list =is.list();
        PageInfo<StudentFloor> rolePageInfo = new PageInfo<>(list);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code",0);
        map.put("count",rolePageInfo.getTotal());
        map.put("data",rolePageInfo.getList());
        return map;
    }

    @RequestMapping("/tolist")
    public String  tolist(){

        return "studentFloor/studentFloorList";
    }

    @RequestMapping("/del")
    public String del(int floorid){
        System.out.println("floorid = " + floorid);
        is.delById(floorid);
        return "redirect:tolist";
    }

    @RequestMapping("/add")
    public String add(StudentFloor studentFloor){
        System.out.println("studentFloor.toString() = " + studentFloor.toString());
        int i = is.insert(studentFloor);
        System.out.println("i = " + i);
        return "redirect:tolist";
    }

    @RequestMapping("/upd")
    public String upd(StudentFloor studentFloor){
        System.out.println("studentFloor.toString() = " + studentFloor.toString());
        int i = is.upd(studentFloor);
        System.out.println("i = " + i);
        return "redirect:tolist";
    }

}
