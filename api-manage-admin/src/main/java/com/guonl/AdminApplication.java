package com.guonl;

import com.guonl.actuator.ApiManageEndPoint;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@Import(value = {ApiManageEndPoint.class})//如果包路径相同，不需要该配置
//@MapperScan({"com.guonl.dao","com.guonl.dao.custom"})
@MapperScan("com.guonl.dao")//可以扫描子包路径
@SpringBootApplication
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
