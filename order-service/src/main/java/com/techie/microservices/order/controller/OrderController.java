package com.techie.microservices.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techie.microservices.order.dto.OrderRequest;
import com.techie.microservices.order.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String placeOrder(@RequestBody OrderRequest orderRequest) {
		orderService.placeOrder(orderRequest);
		return "Order Placed Sucessfully";
	}
	
}
