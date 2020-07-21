package com.guonl.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guonl.system.mapper.ApiProjectMapper;
import com.guonl.system.domain.ApiProject;
import com.guonl.system.service.IApiProjectService;
import com.ruoyi.common.core.text.Convert;

/**
 * 项目列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-07-21
 */
@Service
public class ApiProjectServiceImpl implements IApiProjectService 
{
    @Autowired
    private ApiProjectMapper apiProjectMapper;

    /**
     * 查询项目列表
     * 
     * @param projectId 项目列表ID
     * @return 项目列表
     */
    @Override
    public ApiProject selectApiProjectById(Long projectId)
    {
        return apiProjectMapper.selectApiProjectById(projectId);
    }

    /**
     * 查询项目列表列表
     * 
     * @param apiProject 项目列表
     * @return 项目列表
     */
    @Override
    public List<ApiProject> selectApiProjectList(ApiProject apiProject)
    {
        return apiProjectMapper.selectApiProjectList(apiProject);
    }

    /**
     * 新增项目列表
     * 
     * @param apiProject 项目列表
     * @return 结果
     */
    @Override
    public int insertApiProject(ApiProject apiProject)
    {
        apiProject.setCreateTime(DateUtils.getNowDate());
        return apiProjectMapper.insertApiProject(apiProject);
    }

    /**
     * 修改项目列表
     * 
     * @param apiProject 项目列表
     * @return 结果
     */
    @Override
    public int updateApiProject(ApiProject apiProject)
    {
        apiProject.setUpdateTime(DateUtils.getNowDate());
        return apiProjectMapper.updateApiProject(apiProject);
    }

    /**
     * 删除项目列表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteApiProjectByIds(String ids)
    {
        return apiProjectMapper.deleteApiProjectByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除项目列表信息
     * 
     * @param projectId 项目列表ID
     * @return 结果
     */
    @Override
    public int deleteApiProjectById(Long projectId)
    {
        return apiProjectMapper.deleteApiProjectById(projectId);
    }
}
