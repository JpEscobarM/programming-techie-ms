package com.techie.microservices.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techie.microservices.inventory.dto.InventoryRequest;
import com.techie.microservices.inventory.model.Inventory;
import com.techie.microservices.inventory.repository.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	public boolean isInStock(String skuCode, Integer quantity) {
		
		return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual( skuCode , quantity );
		
	}
	
}
