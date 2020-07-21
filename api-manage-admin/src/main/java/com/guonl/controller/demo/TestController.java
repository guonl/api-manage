package com.guonl.controller.demo;

import com.guonl.model.CustomUrlMappings;
import com.guonl.model.FrontResult;
import com.guonl.model.User;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/user")
    public FrontResult<User> test1(HttpServletRequest request, User user) {
        return FrontResult.success(user);
    }


    @PostMapping("/user2")
    public FrontResult<User> test2(@RequestBody User user) {
        return FrontResult.success(user);
    }

    @PostMapping("/user3")
    public FrontResult<User> test3(String name, Integer age) {
        return FrontResult.success(null);
    }

    @RequestMapping(value = "/user4", method = {RequestMethod.GET, RequestMethod.POST})
    public FrontResult<User> test4(String name, Integer age, String mobile) {
        return FrontResult.success(null);
    }

    @RequestMapping(value = {"/user5","/user-user5"}, method = {RequestMethod.GET, RequestMethod.POST})
    public FrontResult<User> test5(String name, Integer age, String mobile) {
        return FrontResult.success(null);
    }



}
