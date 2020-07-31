package com.guonl.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.guonl.model.ApiUrlMappings;
import com.guonl.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<ApiUrlMappings> getMappingsByUrl(String url) {
        String body = restTemplate.getForEntity(url, String.class).getBody();
        List<ApiUrlMappings> apiUrlMappings = JSON.parseObject(body, new TypeReference<List<ApiUrlMappings>>() {
        });
        return apiUrlMappings;
    }


}
