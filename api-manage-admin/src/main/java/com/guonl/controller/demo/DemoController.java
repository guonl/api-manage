package com.guonl.controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/demo/add")
    public String demoAdd(){
        return "demo/add";
    }

    @GetMapping("/demo/view")
    public String demoView(){
        return "demo/view";
    }

    @GetMapping("/demo/edit")
    public String demoEdit(){
        return "demo/edit";
    }

    @GetMapping("/demo/test")
    public String demoTest(){
        return "demo/test";
    }

}
