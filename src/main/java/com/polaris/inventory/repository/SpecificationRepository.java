package com.polaris.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polaris.inventory.domain.Specification;

@Repository
public interface SpecificationRepository extends JpaRepository<Specification, Long>{

}
