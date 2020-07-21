package com.guonl.config;

import com.guonl.interceptor.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guonl
 * Date 2020/7/21 3:14 PM
 * Description:
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private AuthInterceptor authInterceptor;

    private static final List<String> excludeList;

    static {
        excludeList = new ArrayList<>();
        excludeList.add("/ajax/**");
        excludeList.add("/css/**");
        excludeList.add("/fonts/**");
        excludeList.add("/img/**");
        excludeList.add("/js/**");
        excludeList.add("/**/*.js");
        excludeList.add("/**/*.css");
        excludeList.add("/login");//登录
    }

    /**
     * 拦截某个请求跳转固定位置
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:index");
        registry.addViewController("/index.html").setViewName("forward:index");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

    }

    /**
     * 添加自定义拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(authInterceptor)
                .addPathPatterns("/**")//拦截的访问路径，拦截所有
                .excludePathPatterns(excludeList);//排除的请求路径，排除静态资源路径
    }
}
