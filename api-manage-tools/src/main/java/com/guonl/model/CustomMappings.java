package com.guonl.model;

import lombok.Data;

@Data
public class CustomMappings {

    public String controllerName;

    public String methodName;

    public String requestType;

    public String requestUrl;

    public Class<?>[] methodParmaTypes;

}
