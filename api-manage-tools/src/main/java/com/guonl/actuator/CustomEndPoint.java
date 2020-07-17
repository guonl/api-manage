package com.guonl.actuator;

import com.guonl.model.CustomMappings;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.web.mappings.MappingDescriptionProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Configuration
@Endpoint(id = "api-manage")
public class CustomEndPoint {

    private final Collection<MappingDescriptionProvider> descriptionProviders;
    private final ApplicationContext context;

    public CustomEndPoint(Collection<MappingDescriptionProvider> descriptionProviders, ApplicationContext context) {
        this.descriptionProviders = descriptionProviders;
        this.context = context;
    }

    @ReadOperation
    public ResponseEntity apiManage() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
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

                    //获取接口所在的类名,方法名,参数名
                    String controllerName = mappingInfoValue.getBeanType().toString();
                    String requestMethodName = mappingInfoValue.getMethod().getName();
                    Class<?>[] methodParamTypes = mappingInfoValue.getMethod().getParameterTypes();

                    // 获取请求方式GET/POST/PUT/DELETE,如果size大于1，需要添加两个item
                    RequestMethodsRequestCondition methodCondition = requestMappingInfo.getMethodsCondition();
                    List<RequestMethod> methods = new ArrayList(methodCondition.getMethods());
                    String requestType = "";
                    if(methods.size() > 1){

                    }else {
                        requestType = methods.get(0).name();

                    }

                    // 获取请求的URL,size大于1，需要添加两个item
                    PatternsRequestCondition patternsCondition = requestMappingInfo.getPatternsCondition();
                    List<String> patterns = new ArrayList(patternsCondition.getPatterns());
                    String requestUrl = "";
                    if(patterns.size() > 1){

                    }else {
                        requestUrl = patterns.get(0);
                    }


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
