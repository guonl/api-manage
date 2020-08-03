package com.guonl.controller.demo;

import com.guonl.dao.TApiUrlMapper;
import com.guonl.entity.TApiUrlWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @Autowired
    private TApiUrlMapper apiUrlMapper;

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

    /**************/

    @GetMapping("/demo2/add")
    public String demoAdd2(){
        return "demo2/add";
    }

    @GetMapping("/demo2/view")
    public String demoView2(ModelMap mmap){
        TApiUrlWithBLOBs apiUrl = apiUrlMapper.selectByPrimaryKey(1);
        mmap.put("detail",apiUrl);
        return "demo2/view";
    }

    @GetMapping("/demo2/edit")
    public String demoEdit2(){
        return "demo2/edit";
    }

    @GetMapping("/demo2/test")
    public String demoTest2(){
        return "demo2/test";
    }



}
