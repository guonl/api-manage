package com.guonl.controller;


import com.guonl.entity.custom.ApiUrl;
import com.guonl.model.FrontResult;
import com.guonl.model.page.TableDataInfo;
import com.guonl.service.IApiUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by guonl
 * Date 2020/7/21 6:09 PM
 * Description: url管理
 */
@Controller
@RequestMapping("/url")
public class ApiUrlController extends BaseController {

    @Autowired
    private IApiUrlService apiUrlService;

    @GetMapping("/view")
    public String project() {
        return "url/url";
    }


    /**
     * 查询controller列列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ApiUrl apiUrl) {
        startPage();
        List<ApiUrl> list = apiUrlService.selectApiUrlList(apiUrl);
        return getDataTable(list);
    }


    /**
     * 新增controller列
     */
    @GetMapping("/add")
    public String add() {
        return "url/add";
    }

    /**
     * 新增保存controller列
     */
    @PostMapping("/add")
    @ResponseBody
    public FrontResult addSave(ApiUrl apiUrl) {
        return FrontResult.success(apiUrlService.insertApiUrl(apiUrl));
    }

    /**
     * 修改controller列
     */
    @GetMapping("/edit/{urlId}")
    public String edit(@PathVariable("urlId") Integer urlId, ModelMap mmap) {
        ApiUrl apiUrl = apiUrlService.selectApiUrlById(urlId);
        mmap.put("apiUrl", apiUrl);
        return "url/edit";
    }

    @GetMapping("/detail")
    public String detail( ModelMap mmap) {
//        ApiUrl apiUrl = apiUrlService.selectApiUrlById(urlId);
//        mmap.put("apiUrl", apiUrl);
        return "url/detail/detail";
    }

    @GetMapping("/detail/edit")
    public String detailEdit(ModelMap mmap) {
//        ApiUrl apiUrl = apiUrlService.selectApiUrlById(urlId);
//        mmap.put("apiUrl", apiUrl);
        return "url/detail/edit";
    }

    @GetMapping("/detail/test")
    public String detailTest(ModelMap mmap) {
//        ApiUrl apiUrl = apiUrlService.selectApiUrlById(urlId);
//        mmap.put("apiUrl", apiUrl);


        return "url/detail/validate";
    }

    /**
     * 修改保存controller列
     */

    @PostMapping("/edit")
    @ResponseBody
    public FrontResult editSave(ApiUrl apiUrl) {
        return FrontResult.success(apiUrlService.updateApiUrl(apiUrl));
    }

    /**
     * 删除controller列
     */

    @PostMapping("/remove")
    @ResponseBody
    public FrontResult remove(String ids) {
        return FrontResult.success(apiUrlService.deleteApiUrlByIds(ids));
    }


}
