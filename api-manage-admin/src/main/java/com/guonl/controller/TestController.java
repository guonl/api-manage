package com.guonl.controller;

import com.guonl.model.CustomMappings;
import com.guonl.model.User;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/user")
    public ResponseEntity<User> test1(HttpServletRequest request, User user) {
        return ResponseEntity.ok(user);
    }


    @PostMapping("/user2")
    public ResponseEntity<User> test2(@RequestBody User user) {
        return ResponseEntity.ok(user);
    }

    @PostMapping("/user3")
    public ResponseEntity<User> test3(String name, Integer age) {
        return ResponseEntity.ok(null);
    }

    @RequestMapping(value = "/user4", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<User> test4(String name, Integer age, String mobile) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/getAllUrl")
    public ResponseEntity getAllUrl(HttpServletRequest request) {
        ServletContext servletContext = request.getSession().getServletContext();
        if (servletContext == null) {
            return ResponseEntity.ok(null);
        }
        WebApplicationContext appContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);

        //请求url和处理方法的映射
        List<CustomMappings> itemList = new ArrayList<CustomMappings>();
        //获取所有的RequestMapping
        Map<String, HandlerMapping> allRequestMappings = BeanFactoryUtils.beansOfTypeIncludingAncestors(appContext,
                HandlerMapping.class, true, false);

        allRequestMappings.forEach((key, handlerMapping) -> {
            //本项目只需要RequestMappingHandlerMapping中的URL映射
            if (handlerMapping instanceof RequestMappingHandlerMapping) {
                RequestMappingHandlerMapping requestMappingHandlerMapping = (RequestMappingHandlerMapping) handlerMapping;
                Map<RequestMappingInfo, HandlerMethod> handlerMethods = requestMappingHandlerMapping.getHandlerMethods();

                handlerMethods.forEach((requestMappingInfo, mappingInfoValue) -> {

                    // 获取请求方式GET/POST/PUT/DELETE
                    RequestMethodsRequestCondition methodCondition = requestMappingInfo.getMethodsCondition();
                    Iterator<RequestMethod> it = methodCondition.getMethods().iterator();
                    String requestType = it.hasNext() ? it.next().name() : "";
                    // 获取请求的URL
                    PatternsRequestCondition patternsCondition = requestMappingInfo.getPatternsCondition();
                    Iterator<String> iterator = patternsCondition.getPatterns().iterator();
                    String requestUrl = iterator.hasNext() ? iterator.next() : "";
                    //String requestUrl = SetUtils.first(patternsCondition.getPatterns());

                    //获取接口所在的类名,方法名,参数名
                    String controllerName = mappingInfoValue.getBeanType().toString();
                    String requestMethodName = mappingInfoValue.getMethod().getName();
                    Class<?>[] methodParamTypes = mappingInfoValue.getMethod().getParameterTypes();
                    CustomMappings item = new CustomMappings();
                    item.setControllerName(controllerName);
                    item.setRequestUrl(requestUrl);
                    item.setRequestType(requestType);
                    item.setMethodName(requestMethodName);
                    item.setMethodParmaTypes(methodParamTypes);
                    itemList.add(item);

                });
            }

        });

        return ResponseEntity.ok(itemList);
    }


}
