package com.leonardo.springbootdemo.controller;

import com.leonardo.springbootdemo.entity.ResourceInfo;
import com.leonardo.springbootdemo.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/resource"})
public class ResourceController {

    @Autowired
    private IResourceService iResourceService;

    @RequestMapping(value = {"/all"}, produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public List<ResourceInfo> getAllResources(){
        return iResourceService.getAllResources();
    }
}
