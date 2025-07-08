package com.techie.microservices.order.dto;

import java.math.BigDecimal;

public record orderDTO(
		 Long id,
		 String orderNumber,
		 String skuCode,
		 BigDecimal price,
		 Integer quantity ) {

}
