package com.guonl.service;

import com.guonl.system.domain.ApiProject;

import java.util.List;

/**
 * 项目列表Service接口
 *
 * @author ruoyi
 * @date 2020-07-21
 */
public interface IApiProjectService {
    /**
     * 查询项目列表
     *
     * @param projectId 项目列表ID
     * @return 项目列表
     */
    public ApiProject selectApiProjectById(Long projectId);

    /**
     * 查询项目列表列表
     *
     * @param apiProject 项目列表
     * @return 项目列表集合
     */
    public List<ApiProject> selectApiProjectList(ApiProject apiProject);

    /**
     * 新增项目列表
     *
     * @param apiProject 项目列表
     * @return 结果
     */
    public int insertApiProject(ApiProject apiProject);

    /**
     * 修改项目列表
     *
     * @param apiProject 项目列表
     * @return 结果
     */
    public int updateApiProject(ApiProject apiProject);

    /**
     * 批量删除项目列表
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteApiProjectByIds(String ids);

    /**
     * 删除项目列表信息
     *
     * @param projectId 项目列表ID
     * @return 结果
     */
    public int deleteApiProjectById(Long projectId);
}
