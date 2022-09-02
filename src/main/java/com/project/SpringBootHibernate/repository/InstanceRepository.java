package com.project.SpringBootHibernate.repository;

import com.project.SpringBootHibernate.entity.Instance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstanceRepository extends JpaRepository<Instance, Long> {
}
