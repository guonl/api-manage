package com.guonl.controller;

import com.guonl.constant.UserConstant;
import com.guonl.model.FrontResult;
import com.guonl.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by guonl
 * Date 2020/7/21 1:56 PM
 * Description: 登录导航
 */
@Controller
public class LoginController {


    @GetMapping("/login")
    public String login(ModelMap mmap) {
        return "login";
    }


    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute(UserConstant.ACCESS_USER);
        return "login";
    }

    @ResponseBody
    @PostMapping("/login")
    public FrontResult ajaxLogin(String username, String password, HttpServletRequest request) {
        if(!"admin".equals(username)){
            return FrontResult.error(-1,"用户名错误！");
        }
        if(!"123456".equals(password)){
            return FrontResult.error(-1,"密码错误！");
        }
        HttpSession session = request.getSession();
        User user = new User();
        user.setLoginName(username);
        user.setUserName("管理员");
        user.setAvatar("");
        session.setAttribute(UserConstant.ACCESS_USER, user);
        return FrontResult.success("登录成功！");
    }

}
