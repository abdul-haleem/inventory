package com.polaris.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polaris.inventory.domain.BusinessTransaction;
@Repository
public interface BusinessTransactionRepository extends JpaRepository<BusinessTransaction, Long> {

	
}
