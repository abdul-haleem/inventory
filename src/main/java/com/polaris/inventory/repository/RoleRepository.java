package com.polaris.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polaris.inventory.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
