package com.guonl.dao;

import com.guonl.entity.TApiUrl;
import com.guonl.entity.TApiUrlExample;
import com.guonl.entity.TApiUrlWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TApiUrlMapper {
    long countByExample(TApiUrlExample example);

    int deleteByExample(TApiUrlExample example);

    int deleteByPrimaryKey(Integer urlId);

    int insert(TApiUrlWithBLOBs record);

    int insertSelective(@Param("record") TApiUrlWithBLOBs record, @Param("selective") TApiUrlWithBLOBs.Column ... selective);

    TApiUrl selectOneByExample(TApiUrlExample example);

    TApiUrlWithBLOBs selectOneByExampleWithBLOBs(TApiUrlExample example);

    List<TApiUrlWithBLOBs> selectByExampleWithBLOBs(TApiUrlExample example);

    List<TApiUrl> selectByExample(TApiUrlExample example);

    TApiUrlWithBLOBs selectByPrimaryKey(Integer urlId);

    int updateByExampleSelective(@Param("record") TApiUrlWithBLOBs record, @Param("example") TApiUrlExample example, @Param("selective") TApiUrlWithBLOBs.Column ... selective);

    int updateByExampleWithBLOBs(@Param("record") TApiUrlWithBLOBs record, @Param("example") TApiUrlExample example);

    int updateByExample(@Param("record") TApiUrl record, @Param("example") TApiUrlExample example);

    int updateByPrimaryKeySelective(@Param("record") TApiUrlWithBLOBs record, @Param("selective") TApiUrlWithBLOBs.Column ... selective);

    int updateByPrimaryKeyWithBLOBs(TApiUrlWithBLOBs record);

    int updateByPrimaryKey(TApiUrl record);

    int batchInsert(@Param("list") List<TApiUrlWithBLOBs> list);

    int batchInsertSelective(@Param("list") List<TApiUrlWithBLOBs> list, @Param("selective") TApiUrlWithBLOBs.Column ... selective);
}