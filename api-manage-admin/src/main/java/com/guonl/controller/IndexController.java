package com.guonl.controller;

import com.guonl.constant.UserConstant;
import com.guonl.model.User;
import com.guonl.utils.ServletUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by guonl
 * Date 2020/7/21 5:03 PM
 * Description:
 */
@Controller
public class IndexController {

    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap) {
        HttpSession session = ServletUtils.getSession();
        User user = (User) session.getAttribute(UserConstant.ACCESS_USER);
        mmap.addAttribute("user",user);
        return "index";
    }

    // 切换主题
    @GetMapping("/system/switchSkin")
    public String switchSkin(ModelMap mmap) {
        return "skin";
    }

    // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap) {
        return "main2";
    }



}
