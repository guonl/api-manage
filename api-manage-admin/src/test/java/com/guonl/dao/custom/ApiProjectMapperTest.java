package com.guonl.dao.custom;

import com.guonl.AdminApplicationTest;
import com.guonl.entity.custom.ApiProject;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Created by guonl
 * Date 2020/7/26 6:11 PM
 * Description:
 */
@SpringBootTest(classes = AdminApplicationTest.class)
class ApiProjectMapperTest {

    @Autowired
    private ApiProjectDao apiProjectMapper;

    @Test
    void selectApiProjectById() {
    }

    @Test
    void selectApiProjectList() {
        List<ApiProject> apiProjects = apiProjectMapper.selectApiProjectList(new ApiProject());
        Assert.assertEquals(true,apiProjects.size() >= 0);
    }

    @Test
    void insertApiProject() {
    }

    @Test
    void updateApiProject() {
    }

    @Test
    void deleteApiProjectById() {
    }

    @Test
    void deleteApiProjectByIds() {
    }
}