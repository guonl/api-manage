package com.guonl.actuator;

import com.guonl.model.ApiUrlMappings;
import com.guonl.utils.ParameterNameUtils;
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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Configuration
@Endpoint(id = "api-manage")
public class ApiManageEndPoint {

    private final Collection<MappingDescriptionProvider> descriptionProviders;
    private final ApplicationContext context;

    private static final List<String> blackList;

    static {
        blackList = new ArrayList<>();
        blackList.add("org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController");
    }

    public ApiManageEndPoint(Collection<MappingDescriptionProvider> descriptionProviders, ApplicationContext context) {
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
        List<ApiUrlMappings> itemList = new ArrayList<ApiUrlMappings>();
        //获取所有的RequestMapping
        Map<String, HandlerMapping> allRequestMappings = BeanFactoryUtils.beansOfTypeIncludingAncestors(appContext,
                HandlerMapping.class, true, false);

        allRequestMappings.forEach((key, handlerMapping) -> {
            //本项目只需要RequestMappingHandlerMapping中的URL映射
            if (handlerMapping instanceof RequestMappingHandlerMapping) {
                RequestMappingHandlerMapping requestMappingHandlerMapping = (RequestMappingHandlerMapping) handlerMapping;
                Map<RequestMappingInfo, HandlerMethod> handlerMethods = requestMappingHandlerMapping.getHandlerMethods();

                handlerMethods.forEach((requestMappingInfo, handlerMethod) -> {
                    //获取接口所在的类名,方法名,参数名
                    Class<?> beanType = handlerMethod.getBeanType();
                    String controllerName = handlerMethod.getBeanType().getName();
                    if (blackList.contains(controllerName)) {
                        return;//跳过本次循环
                    }
                    Method method = handlerMethod.getMethod();
                    String methodContentType = ParameterNameUtils.getMethodContentType(method);
                    Map<String, Object> parameterMap = ParameterNameUtils.getMethodParameter(method);
                    String requestMethodName = method.getName();
                    Class<?>[] methodParamTypes = method.getParameterTypes();
                    Class<?> returnType = method.getReturnType();
                    //解析返回对象的泛型
                    Map<String, Object> returnFields = ParameterNameUtils.getClassFields(returnType);

                    // 获取请求方式GET/POST/PUT/DELETE,可能存在多个，for循环遍历
                    RequestMethodsRequestCondition methodCondition = requestMappingInfo.getMethodsCondition();
                    List<RequestMethod> methods = new ArrayList(methodCondition.getMethods());

                    // 获取请求的URL,可能存在多个，for循环遍历
                    PatternsRequestCondition patternsCondition = requestMappingInfo.getPatternsCondition();
                    List<String> patterns = new ArrayList(patternsCondition.getPatterns());

                    for (RequestMethod requestMethod : methods) {
                        for (String pattern : patterns) {
                            ApiUrlMappings item = new ApiUrlMappings();
                            item.setControllerName(controllerName);
                            item.setRequestUrl(pattern);
                            item.setMethodType(requestMethod.name());
                            item.setMethodName(requestMethodName);
                            item.setRequestParamClass(methodParamTypes);
                            item.setRequestParamMap(parameterMap);
                            item.setReturnParamClass(returnType);
                            item.setReturnParamMap(returnFields);
                            item.setMethodContentType(methodContentType);
                            itemList.add(item);
                        }
                    }
                });
            }
        });
        return ResponseEntity.ok(itemList);
    }


}
