package com.project.SpringBootHibernate.service;

import com.project.SpringBootHibernate.entity.Instance;

import java.util.List;

public interface InstanceService {

    Instance saveInstance(Instance instance) ;

    List<Instance> fetchInstanceList() ;

    void deleteInstanceById(Long insId) ;

}
