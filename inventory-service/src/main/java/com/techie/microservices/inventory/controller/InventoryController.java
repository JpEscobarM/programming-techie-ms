package com.techie.microservices.inventory.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techie.microservices.inventory.dto.InventoryRequest;
import com.techie.microservices.inventory.model.Inventory;
import com.techie.microservices.inventory.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

	private InventoryService inventoryService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Inventory addInventory(@RequestBody InventoryRequest requestInventory) {
		
		return inventoryService.addInventory(requestInventory);
	}
	
}
