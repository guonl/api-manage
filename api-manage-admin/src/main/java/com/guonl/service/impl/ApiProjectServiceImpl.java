package com.guonl.service.impl;

import com.alibaba.fastjson.JSON;
import com.guonl.dao.TApiControllerMapper;
import com.guonl.dao.TApiUrlMapper;
import com.guonl.dao.custom.ApiControllerDao;
import com.guonl.dao.custom.ApiProjectDao;
import com.guonl.entity.TApiController;
import com.guonl.entity.TApiUrl;
import com.guonl.entity.TApiUrlWithBLOBs;
import com.guonl.entity.custom.ApiController;
import com.guonl.entity.custom.ApiProject;
import com.guonl.model.ApiUrlMappings;
import com.guonl.service.ApiService;
import com.guonl.service.IApiProjectService;
import com.guonl.utils.Convert;
import com.guonl.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 项目列表Service业务层处理
 *
 * @author guonl
 * @date 2020-07-21
 */
@Service
public class ApiProjectServiceImpl implements IApiProjectService {

    @Autowired
    private ApiProjectDao apiProjectDao;
    @Autowired
    private TApiControllerMapper tApiControllerMapper;
    @Autowired
    private TApiUrlMapper tApiUrlMapper;
    @Autowired
    private ApiService apiService;
    @Autowired
    private ApiControllerDao apiControllerDao;

    /**
     * 查询项目列表
     *
     * @param projectId 项目列表ID
     * @return 项目列表
     */
    @Override
    public ApiProject selectApiProjectById(Integer projectId) {
        return apiProjectDao.selectApiProjectById(projectId);
    }

    /**
     * 查询项目列表列表
     *
     * @param apiProject 项目列表
     * @return 项目列表
     */
    @Override
    public List<ApiProject> selectApiProjectList(ApiProject apiProject) {
        return apiProjectDao.selectApiProjectList(apiProject);
    }

    /**
     * 新增项目列表
     *
     * @param apiProject 项目列表
     * @return 结果
     */
    @Transactional
    @Override
    public int insertApiProject(ApiProject apiProject) {
        int i = apiProjectDao.insertApiProject(apiProject);
        Integer projectId = apiProject.getProjectId();
        String manageUrl = apiProject.getManageUrl();
        List<ApiUrlMappings> mappings = apiService.getMappingsByUrl(manageUrl);
        Map<String, List<ApiUrlMappings>> groupMap = mappings.stream().collect(Collectors.groupingBy(ApiUrlMappings::getControllerName));
        groupMap.forEach((name,list)->{
            ApiController controller = new ApiController();
            controller.setProjectId(projectId);
            controller.setControllerName(name);
            int index = name.lastIndexOf(".");
            controller.setControllerShortName(name.substring(index + 1));
            int i2 = apiControllerDao.insertApiController(controller);
            List<TApiUrlWithBLOBs> urlList = new ArrayList<>();
            list.forEach(x->{
                TApiUrlWithBLOBs url = new TApiUrlWithBLOBs();
                url.setControllerId(controller.getControllerId());
                url.setRequestUrl(x.getRequestUrl());
                url.setMethodName(x.getMethodName());
                url.setMethodType(x.getMethodType());
                url.setMethodContentType(x.getMethodContentType());
                url.setRequestParamMap(JSON.toJSONString(x.getRequestParamMap()));
                url.setReturnParamClass(x.getReturnParamClass().getName());
                url.setReturnParamMap(JSON.toJSONString(x.getReturnParamMap()));
                url.setUrlStatus(1);
                url.setUrlLabel("");
                url.setMethodDesc("");
                url.setCreateTime(new Date());
                url.setUpdateTime(new Date());
                url.setDelFlag(Boolean.FALSE);
                urlList.add(url);
            });
            int i1 = tApiUrlMapper.batchInsert(urlList);
        });
        return i;
    }

    /**
     * 修改项目列表
     *
     * @param apiProject 项目列表
     * @return 结果
     */
    @Override
    public int updateApiProject(ApiProject apiProject) {
        return apiProjectDao.updateApiProject(apiProject);
    }

    /**
     * 删除项目列表对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteApiProjectByIds(String ids) {
        return apiProjectDao.deleteApiProjectByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除项目列表信息
     *
     * @param projectId 项目列表ID
     * @return 结果
     */
    @Override
    public int deleteApiProjectById(Integer projectId) {
        return apiProjectDao.deleteApiProjectById(projectId);
    }
}
