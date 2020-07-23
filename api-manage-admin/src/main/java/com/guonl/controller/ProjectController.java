package com.guonl.controller;

import com.guonl.entity.custom.ApiProject;
import com.guonl.model.FrontResult;
import com.guonl.model.page.TableDataInfo;
import com.guonl.service.IApiProjectService;
import com.guonl.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by guonl
 * Date 2020/7/21 6:09 PM
 * Description: 项目管理
 */
@Controller
@RequestMapping("/project")
public class ProjectController extends BaseController {

    @Autowired
    private IApiProjectService apiProjectService;


    /**
     * 查询项目列表列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ApiProject apiProject) {
        startPage();
        List<ApiProject> list = apiProjectService.selectApiProjectList(apiProject);
        return getDataTable(list);
    }

    /**
     * 导出项目列表列表
     */
    @PostMapping("/export")
    @ResponseBody
    public FrontResult export(ApiProject apiProject) {
        List<ApiProject> list = apiProjectService.selectApiProjectList(apiProject);
        ExcelUtil<ApiProject> util = new ExcelUtil<ApiProject>(ApiProject.class);
        return util.exportExcel(list, "project");
    }

    /**
     * 新增项目列表
     */
    @GetMapping("/add")
    public String add() {
        return "/add";
    }

    /**
     * 新增保存项目列表
     */
    @PostMapping("/add")
    @ResponseBody
    public FrontResult addSave(ApiProject apiProject) {
        return FrontResult.success(apiProjectService.insertApiProject(apiProject));
    }

    /**
     * 修改项目列表
     */
    @GetMapping("/edit/{projectId}")
    public String edit(@PathVariable("projectId") Integer projectId, ModelMap mmap) {
        ApiProject apiProject = apiProjectService.selectApiProjectById(projectId);
        mmap.put("apiProject", apiProject);
        return "/edit";
    }

    /**
     * 修改保存项目列表
     */
    @PostMapping("/edit")
    @ResponseBody
    public FrontResult editSave(ApiProject apiProject) {
        return FrontResult.success(apiProjectService.updateApiProject(apiProject));
    }

    /**
     * 删除项目列表
     */
    @PostMapping("/remove")
    @ResponseBody
    public FrontResult remove(String ids) {
        return FrontResult.success(apiProjectService.deleteApiProjectByIds(ids));
    }


}
