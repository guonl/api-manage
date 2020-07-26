//package com.guonl.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ResourceLoader;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import javax.sql.DataSource;
//
//
///**
// * Created by guonl
// * Date 2020/7/26 6:35 PM
// * Description:
// */
//@Slf4j
//@Configuration
//public class MyBatisConfig {
//    @Autowired
//    private MybatisProperties properties;
//
//    @Autowired
//    private ResourceLoader resourceLoader;
//
//    @Autowired
//    private DataSource druidDataSource;
//
//    @Value("${mybatis.mapperLocations:''}")
//    private String mapperLocations;
//
//    @Value("${mybatis.typeAliasesPackage:''}")
//    private String typeAliasesPackage;
//
////    @Value("${mybatis.configLocation}")
////    private String configLocation;
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
//        log.info("sqlSessionFactory:--->mybatis.mapperLocation:" + mapperLocations);
//
//        sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasesPackage);
////        sqlSessionFactoryBean.setConfigLocation(resourceLoader.getResource(configLocation));
//        sqlSessionFactoryBean.setDataSource(druidDataSource);
//        org.apache.ibatis.session.Configuration cfg = new org.apache.ibatis.session.Configuration();//configuration
////        cfg.setDefaultStatementTimeout(dst);//设置相关参数，我这里就只用了一个
//        log.info("sqlSessionFactoryBean:-->" + sqlSessionFactoryBean.getObject());
////        log.info("default-statement-timeout:" + dst);
//        sqlSessionFactoryBean.setConfiguration(cfg);
//        return sqlSessionFactoryBean.getObject();
//    }
//}