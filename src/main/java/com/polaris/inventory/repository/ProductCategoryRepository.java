package com.polaris.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polaris.inventory.domain.ProductCategory;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long>{

}
