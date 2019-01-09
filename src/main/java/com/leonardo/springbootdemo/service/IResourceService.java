package com.leonardo.springbootdemo.service;

import com.leonardo.springbootdemo.entity.ResourceInfo;


import java.util.List;

public interface IResourceService {
    List<ResourceInfo> getAllResources();
}
