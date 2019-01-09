package com.leonardo.springbootdemo.service.implement;

import com.leonardo.springbootdemo.entity.ResourceInfo;
import com.leonardo.springbootdemo.mapper.ResourceInfoMapper;
import com.leonardo.springbootdemo.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImplement implements IResourceService {

    @Autowired
    private ResourceInfoMapper resourceInfoMapper;
    @Override
    public List<ResourceInfo> getAllResources() {
        return resourceInfoMapper.getAllResources();
    }
}
