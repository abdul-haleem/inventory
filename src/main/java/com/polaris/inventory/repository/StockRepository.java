package com.polaris.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polaris.inventory.domain.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{

}
