package com.techie.microservices.inventory.dto;

public record InventoryRequest(
		String sku_code,
		Integer quantity
		) {

}
