package com.guonl.service.impl;

import com.guonl.dao.custom.ApiUrlDao;
import com.guonl.entity.custom.ApiUrl;
import com.guonl.service.IApiUrlService;
import com.guonl.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * controller列Service业务层处理
 *
 * @author ruoyi
 * @date 2020-07-29
 */
@Service
public class ApiUrlServiceImpl implements IApiUrlService {
    @Autowired
    private ApiUrlDao apiUrlDao;

    /**
     * 查询controller列
     *
     * @param urlId controller列ID
     * @return controller列
     */
    @Override
    public ApiUrl selectApiUrlById(Integer urlId) {
        return apiUrlDao.selectApiUrlById(urlId);
    }

    /**
     * 查询controller列列表
     *
     * @param apiUrl controller列
     * @return controller列
     */
    @Override
    public List<ApiUrl> selectApiUrlList(ApiUrl apiUrl) {
        return apiUrlDao.selectApiUrlList(apiUrl);
    }

    /**
     * 新增controller列
     *
     * @param apiUrl controller列
     * @return 结果
     */
    @Override
    public int insertApiUrl(ApiUrl apiUrl) {
        return apiUrlDao.insertApiUrl(apiUrl);
    }

    /**
     * 修改controller列
     *
     * @param apiUrl controller列
     * @return 结果
     */
    @Override
    public int updateApiUrl(ApiUrl apiUrl) {
        return apiUrlDao.updateApiUrl(apiUrl);
    }

    /**
     * 删除controller列对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteApiUrlByIds(String ids) {
        return apiUrlDao.deleteApiUrlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除controller列信息
     *
     * @param urlId controller列ID
     * @return 结果
     */
    @Override
    public int deleteApiUrlById(Integer urlId) {
        return apiUrlDao.deleteApiUrlById(urlId);
    }
}
