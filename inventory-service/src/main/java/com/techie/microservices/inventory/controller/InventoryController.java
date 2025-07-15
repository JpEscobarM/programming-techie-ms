package com.techie.microservices.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techie.microservices.inventory.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public boolean existsInInventory(@RequestParam String skuCode, @RequestParam Integer quantity) {
		
		return  inventoryService.isInStock(skuCode,quantity);
	}
	
}
