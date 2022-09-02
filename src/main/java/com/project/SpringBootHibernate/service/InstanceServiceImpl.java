package com.project.SpringBootHibernate.service;

import com.project.SpringBootHibernate.entity.Instance;
import com.project.SpringBootHibernate.repository.InstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstanceServiceImpl implements InstanceService{
    @Autowired
    private InstanceRepository instanceRepository;

    @Override
    public Instance saveInstance(Instance instance)
    {
        return instanceRepository.save(instance);
    }

    @Override
    public List<Instance>fetchInstanceList()
    {
        return (List<Instance>) instanceRepository.findAll();
    }

    @Override
    public void deleteInstanceById(Long insId)
    {
        instanceRepository.deleteById(insId);
    }
}
