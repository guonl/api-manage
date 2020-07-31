package com.guonl.service;

import com.guonl.model.ApiUrlMappings;

import java.util.List;

public interface ApiService {

    List<ApiUrlMappings> getMappingsByUrl(String url);


}
