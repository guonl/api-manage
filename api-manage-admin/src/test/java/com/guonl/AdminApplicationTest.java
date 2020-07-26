package com.guonl;


import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by guonl
 * Date 2020/7/19 11:46 AM
 * Description:
 */
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@MapperScan("com.guonl.dao")//可以扫描子包路径
@SpringBootTest
public class AdminApplicationTest {

}