package com.example.demo.controller;

import com.example.demo.bean.Role;
import com.example.demo.dao.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Lenovo on 2017/11/2.
 */

//fff.ftl访问不到，其他的页面都可以访问！
    //这里可能不需要webapp这个目录结构，因为都放在resource里也可以运行
    //application.yml是全局配置！
    //除了webapp目录，其他文件目录结构都是标准式
    //
@Controller
public class RoleController {
    @Autowired
    RoleMapper roleMapper;

    @RequestMapping("/role/{id}")
    @ResponseBody
    public ModelAndView selectByPrimaryKey(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView("index");
        Role role = roleMapper.selectByPrimaryKey(id);
        mv.addObject("role", role);
        return mv;
    }

    @RequestMapping("/hh")
    public String hh() {
        return "log.html";
    }

    @RequestMapping("/mm")
    public String m() {
        return "index";
    }
}
