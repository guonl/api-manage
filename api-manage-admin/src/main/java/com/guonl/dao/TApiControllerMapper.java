package com.guonl.dao;

import com.guonl.entity.TApiController;
import com.guonl.entity.TApiControllerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TApiControllerMapper {
    long countByExample(TApiControllerExample example);

    int deleteByExample(TApiControllerExample example);

    int deleteByPrimaryKey(Integer controllerId);

    int insert(TApiController record);

    int insertSelective(@Param("record") TApiController record, @Param("selective") TApiController.Column ... selective);

    TApiController selectOneByExample(TApiControllerExample example);

    List<TApiController> selectByExample(TApiControllerExample example);

    TApiController selectByPrimaryKey(Integer controllerId);

    int updateByExampleSelective(@Param("record") TApiController record, @Param("example") TApiControllerExample example, @Param("selective") TApiController.Column ... selective);

    int updateByExample(@Param("record") TApiController record, @Param("example") TApiControllerExample example);

    int updateByPrimaryKeySelective(@Param("record") TApiController record, @Param("selective") TApiController.Column ... selective);

    int updateByPrimaryKey(TApiController record);

    int batchInsert(@Param("list") List<TApiController> list);

    int batchInsertSelective(@Param("list") List<TApiController> list, @Param("selective") TApiController.Column ... selective);
}