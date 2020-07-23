package com.guonl.dao.custom;

import com.guonl.entity.custom.ApiProject;
import java.util.List;

/**
 * 项目列表Mapper接口
 *
 * @author guonl
 * @date 2020-07-21
 */
public interface ApiProjectMapper {
    
    /**
     * 查询项目列表
     *
     * @param projectId 项目列表ID
     * @return 项目列表
     */
    ApiProject selectApiProjectById(Integer projectId);

    /**
     * 查询项目列表列表
     *
     * @param apiProject 项目列表
     * @return 项目列表集合
     */
    List<ApiProject> selectApiProjectList(ApiProject apiProject);

    /**
     * 新增项目列表
     *
     * @param apiProject 项目列表
     * @return 结果
     */
    int insertApiProject(ApiProject apiProject);

    /**
     * 修改项目列表
     *
     * @param apiProject 项目列表
     * @return 结果
     */
    int updateApiProject(ApiProject apiProject);

    /**
     * 删除项目列表
     *
     * @param projectId 项目列表ID
     * @return 结果
     */
    int deleteApiProjectById(Integer projectId);

    /**
     * 批量删除项目列表
     *
     * @param projectIds 需要删除的数据ID
     * @return 结果
     */
    int deleteApiProjectByIds(String[] projectIds);
}
