package com.guonl.dao;

import com.guonl.entity.TApiUrlDoc;
import com.guonl.entity.TApiUrlDocExample;
import com.guonl.entity.TApiUrlDocWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TApiUrlDocMapper {
    long countByExample(TApiUrlDocExample example);

    int deleteByExample(TApiUrlDocExample example);

    int deleteByPrimaryKey(Integer urlId);

    int insert(TApiUrlDocWithBLOBs record);

    int insertSelective(@Param("record") TApiUrlDocWithBLOBs record, @Param("selective") TApiUrlDocWithBLOBs.Column ... selective);

    TApiUrlDoc selectOneByExample(TApiUrlDocExample example);

    TApiUrlDocWithBLOBs selectOneByExampleWithBLOBs(TApiUrlDocExample example);

    List<TApiUrlDocWithBLOBs> selectByExampleWithBLOBs(TApiUrlDocExample example);

    List<TApiUrlDoc> selectByExample(TApiUrlDocExample example);

    TApiUrlDocWithBLOBs selectByPrimaryKey(Integer urlId);

    int updateByExampleSelective(@Param("record") TApiUrlDocWithBLOBs record, @Param("example") TApiUrlDocExample example, @Param("selective") TApiUrlDocWithBLOBs.Column ... selective);

    int updateByExampleWithBLOBs(@Param("record") TApiUrlDocWithBLOBs record, @Param("example") TApiUrlDocExample example);

    int updateByExample(@Param("record") TApiUrlDoc record, @Param("example") TApiUrlDocExample example);

    int updateByPrimaryKeySelective(@Param("record") TApiUrlDocWithBLOBs record, @Param("selective") TApiUrlDocWithBLOBs.Column ... selective);

    int updateByPrimaryKeyWithBLOBs(TApiUrlDocWithBLOBs record);

    int updateByPrimaryKey(TApiUrlDoc record);

    int batchInsert(@Param("list") List<TApiUrlDocWithBLOBs> list);

    int batchInsertSelective(@Param("list") List<TApiUrlDocWithBLOBs> list, @Param("selective") TApiUrlDocWithBLOBs.Column ... selective);
}