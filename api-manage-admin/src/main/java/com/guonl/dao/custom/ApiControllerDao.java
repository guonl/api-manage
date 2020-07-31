package com.guonl.dao.custom;


import com.guonl.entity.custom.ApiController;

import java.util.List;

/**
 * controller列Mapper接口
 *
 * @author ruoyi
 * @date 2020-07-29
 */
public interface ApiControllerDao {
    /**
     * 查询controller列
     *
     * @param controllerId controller列ID
     * @return controller列
     */
    public ApiController selectApiControllerById(Integer controllerId);

    /**
     * 查询controller列列表
     *
     * @param apiController controller列
     * @return controller列集合
     */
    public List<ApiController> selectApiControllerList(ApiController apiController);

    /**
     * 新增controller列
     *
     * @param apiController controller列
     * @return 结果
     */
    public int insertApiController(ApiController apiController);

    /**
     * 修改controller列
     *
     * @param apiController controller列
     * @return 结果
     */
    public int updateApiController(ApiController apiController);

    /**
     * 删除controller列
     *
     * @param controllerId controller列ID
     * @return 结果
     */
    public int deleteApiControllerById(Integer controllerId);

    /**
     * 批量删除controller列
     *
     * @param controllerIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteApiControllerByIds(String[] controllerIds);
}
