package com.polaris.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polaris.inventory.domain.StockLocation;

@Repository
public interface StockLocationRepository extends JpaRepository<StockLocation, Long> {

	public StockLocation findByStoreId(Long storeId);
}

