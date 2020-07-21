package com.guonl.dao;

import com.guonl.entity.TApiProject;
import com.guonl.entity.TApiProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TApiProjectMapper {
    long countByExample(TApiProjectExample example);

    int deleteByExample(TApiProjectExample example);

    int deleteByPrimaryKey(Integer projectId);

    int insert(TApiProject record);

    int insertSelective(@Param("record") TApiProject record, @Param("selective") TApiProject.Column ... selective);

    TApiProject selectOneByExample(TApiProjectExample example);

    List<TApiProject> selectByExample(TApiProjectExample example);

    TApiProject selectByPrimaryKey(Integer projectId);

    int updateByExampleSelective(@Param("record") TApiProject record, @Param("example") TApiProjectExample example, @Param("selective") TApiProject.Column ... selective);

    int updateByExample(@Param("record") TApiProject record, @Param("example") TApiProjectExample example);

    int updateByPrimaryKeySelective(@Param("record") TApiProject record, @Param("selective") TApiProject.Column ... selective);

    int updateByPrimaryKey(TApiProject record);

    int batchInsert(@Param("list") List<TApiProject> list);

    int batchInsertSelective(@Param("list") List<TApiProject> list, @Param("selective") TApiProject.Column ... selective);
}