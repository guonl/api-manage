package com.guonl.service.impl;

import com.guonl.dao.custom.ApiProjectDao;
import com.guonl.entity.custom.ApiProject;
import com.guonl.service.IApiProjectService;
import com.guonl.utils.Convert;
import com.guonl.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Override
    public int insertApiProject(ApiProject apiProject) {
        apiProject.setCreateTime(DateUtils.getNowDate());
        return apiProjectDao.insertApiProject(apiProject);
    }

    /**
     * 修改项目列表
     *
     * @param apiProject 项目列表
     * @return 结果
     */
    @Override
    public int updateApiProject(ApiProject apiProject) {
        apiProject.setUpdateTime(DateUtils.getNowDate());
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
