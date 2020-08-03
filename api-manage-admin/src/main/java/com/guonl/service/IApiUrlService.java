package com.guonl.service;

import com.guonl.entity.custom.ApiUrl;

import java.util.List;

/**
 * controller列Service接口
 *
 * @author guonl
 * @date 2020-07-29
 */
public interface IApiUrlService {
    /**
     * 查询controller列
     *
     * @param urlId controller列ID
     * @return controller列
     */
    public ApiUrl selectApiUrlById(Integer urlId);

    /**
     * 查询controller列列表
     *
     * @param apiUrl controller列
     * @return controller列集合
     */
    public List<ApiUrl> selectApiUrlList(ApiUrl apiUrl);

    /**
     * 新增controller列
     *
     * @param apiUrl controller列
     * @return 结果
     */
    public int insertApiUrl(ApiUrl apiUrl);

    /**
     * 修改controller列
     *
     * @param apiUrl controller列
     * @return 结果
     */
    public int updateApiUrl(ApiUrl apiUrl);

    /**
     * 批量删除controller列
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteApiUrlByIds(String ids);

    /**
     * 删除controller列信息
     *
     * @param urlId controller列ID
     * @return 结果
     */
    public int deleteApiUrlById(Integer urlId);
}
