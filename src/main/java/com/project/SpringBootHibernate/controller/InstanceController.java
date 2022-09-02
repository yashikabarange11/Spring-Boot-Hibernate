package com.project.SpringBootHibernate.controller;


import com.project.SpringBootHibernate.entity.Instance;
import com.project.SpringBootHibernate.service.InstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstanceController {

    @Autowired
    private InstanceService instanceService;

    @PostMapping("/saveInstance")
    public Instance saveInstance(
            @Validated
            @RequestBody Instance instance
    )
    {
        return instanceService.saveInstance(instance);
    }

    @GetMapping("/getInstance")
    public List<Instance> fetchInstanceList()
    {
        return instanceService.fetchInstanceList();
    }

    @DeleteMapping("/deleteInstance/{id}")
    public String deleteInstanceById(
            @PathVariable("id") Long insId
    )
    {
        instanceService.deleteInstanceById(insId);
        return  "Delete Successfully!!";
    }
}
