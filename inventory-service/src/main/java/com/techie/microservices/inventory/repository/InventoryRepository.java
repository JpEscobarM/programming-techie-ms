package com.techie.microservices.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.techie.microservices.inventory.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long>{

	
	boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);

}
