package com.guonl.controller.demo;

import com.alibaba.fastjson.JSON;
import com.guonl.dao.TApiUrlMapper;
import com.guonl.entity.TApiUrlWithBLOBs;
import com.guonl.model.ApiDocument;
import com.guonl.model.FrontResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Slf4j
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
    public String demoAdd2(ModelMap mmap){
        mmap.put("projectId",1);
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


    @RequestMapping("/document/add")
    @ResponseBody
    public FrontResult<Integer> add(HttpServletRequest request, ApiDocument apiDocument) {
        log.info(JSON.toJSONString(apiDocument));
        return FrontResult.success(1);
    }



}
