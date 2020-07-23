package com.guonl.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.core.AliasRegistry;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by guonl
 * Date 2020/7/19 7:11 PM
 * Description: 获取方法的参数名
 * 参考链接：https://blog.csdn.net/wwwwenl/article/details/53427039
 */
public class ParameterNameUtils {

    private static final List<String> filterList;

    static {
        filterList = new ArrayList<>();
        filterList.add("javax.servlet.http.HttpServletRequest");
        filterList.add("javax.servlet.http.HttpServletResponse");
        filterList.add("org.springframework.ui.ModelMap");
        filterList.add("javax.servlet.http.HttpSession");
        filterList.add("org.springframework.ui.Model");
        filterList.add("org.springframework.ui.ModelMap");
    }

    /**
     * 获取指定方法的参数名
     *
     * @param method 要获取参数名的方法
     * @return 按参数顺序排列的参数名列表
     */
    public static String[] getMethodParameterNamesByAnnotation(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (parameterAnnotations == null || parameterAnnotations.length == 0) {
            return null;
        }
        String[] parameterNames = new String[parameterAnnotations.length];
        int i = 0;
        for (Annotation[] parameterAnnotation : parameterAnnotations) {
            for (Annotation annotation : parameterAnnotation) {
                if (annotation instanceof RequestParam) {
                    RequestParam param = (RequestParam) annotation;
                    parameterNames[i++] = param.value();
                }
            }
        }
        return parameterNames;
    }

    /**
     * 获取请求的ContentType
     * application/x-www-form-urlencoded是默认类型  application/json
     * @param method
     * @return
     */
    public static String getMethodContentType(Method method){
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (parameterAnnotations == null || parameterAnnotations.length == 0) {
            return "application/x-www-form-urlencoded";
        }
        for (Annotation[] parameterAnnotation : parameterAnnotations) {
            for (Annotation annotation : parameterAnnotation) {
                if (annotation instanceof RequestParam) {
                    return "application/x-www-form-urlencoded";
                }else if(annotation instanceof RequestBody){
                    return "application/json";
                }
            }
        }
        return "application/x-www-form-urlencoded";
    }


    /**
     * spring-core中的LocalVariableTableParameterNameDiscoverer
     * 来获取函数参数名称，它对ASM进行了封装
     *
     * @param method
     * @return
     */
    public static Map<String, Object> getMethodParameter(Method method) {
        Map<String, Object> map = new HashMap<>();
        ParameterNameDiscoverer discoverer = new LocalVariableTableParameterNameDiscoverer();
        String[] parameterNames = discoverer.getParameterNames(method);
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterNames.length; i++) {
            Class<?> parameterType = parameterTypes[i];
            boolean baseType = isBaseType(parameterType);
            if(baseType){
                map.put(parameterNames[i], parameterType);
            }else {
                if(!filterList.contains(parameterType.getName())){
                    Map<String, Object> classFields = getClassFields(parameterType);
                    map.putAll(classFields);
                }
            }
        }
        return map;
    }


    /**
     * 获取类的所有成员变量
     *
     * @param clazz
     * @return
     */
    public static Map<String, Object> getClassFields(Class<?> clazz) {
        Map<String, Object> map = new HashMap<>();
        if(isBaseType(clazz)){
            map.put(clazz.getName(),clazz.getName());
        }else {
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field field : declaredFields) {
                map.put(field.getName(), field.getType());
            }
        }
        return map;
    }


//    /**
//     * 获取方法返回对象的所有成员变量（包含泛型解析）
//     * @param method
//     * @return
//     */
//    public static JSONObject getReturnClassFields(Method method) {
//        JSONObject jsonObject = new JSONObject();
//        //获取泛型
//        Class<?> clazz = method.getReturnType();
//        //返回类型不会直接是list
//        if(clazz == List.class){
//        }
//        Type type = method.getGenericReturnType();
//        if (type instanceof ParameterizedType) {
//            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
//            //因为list泛型只有一个值 所以直接取0下标
//            Class<?> rawType = ((ParameterizedTypeImpl) actualTypeArguments[0]).getRawType();
//            if(rawType == List.class){
//                List list = new ArrayList();
//                Type[] typeArguments = ((ParameterizedTypeImpl) actualTypeArguments[0]).getActualTypeArguments();
//                String typeName = typeArguments[0].getTypeName();
//                //真实返回值类型 Class对象
//                try {
//                    Class<?> actualType = Class.forName(typeName);
//                    Object o = actualType.newInstance();
//
//                    jsonObject.putAll(classFields);
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//            }else {
//                Class<?> aClass = ((ParameterizedTypeImpl) actualTypeArguments[0]).getRawType();
//                Map<String, Object> classFields = loopGetClassFields(aClass);
//                jsonObject.putAll(classFields);
//            }
//        }
//        return jsonObject;
//    }


    /**
     * 递归遍历所有的class中的所有成员变量
     * @param clazz
     * @return
     */
    private static Map<String,Object> loopGetClassFields(Class<?> clazz){
        Map<String, Object> map = new HashMap<>();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            Class<?> aClass = field.getType();
            boolean baseType = isBaseType(aClass);
            //如果是基础类型
            if(baseType){
                map.put(field.getName(), aClass);
            }else {
                //非基础类型,递归遍历
                Map<String, Object> loopMap = loopGetClassFields(aClass);
                map.putAll(loopMap);
            }
        }
        return map;
    }


    /**
     * 判断变量是否为基础类型
     * @param clazz
     * @return
     */
    public static boolean isBaseType(Class<?> clazz) {
        if (clazz.equals(java.lang.Integer.class) ||
                clazz.equals(java.lang.Byte.class) ||
                clazz.equals(java.lang.Long.class) ||
                clazz.equals(java.lang.Double.class) ||
                clazz.equals(java.lang.Float.class) ||
                clazz.equals(java.lang.Character.class) ||
                clazz.equals(java.lang.Short.class) ||
                clazz.equals(java.lang.Boolean.class) ||
                clazz.equals(java.lang.String.class)) {
            return true;
        }
        return false;
    }


}
