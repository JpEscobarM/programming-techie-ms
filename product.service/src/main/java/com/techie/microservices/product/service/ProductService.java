package com.techie.microservices.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techie.microservices.product.dto.ProductRequest;
import com.techie.microservices.product.model.Product;
import com.techie.microservices.product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product createProduct(ProductRequest prodRequest) {
	//Product p = new Product(prodRequest.id(),prodRequest.name(),prodRequest.description(),prodRequest.price());
		
		Product product = Product.builder()
			    .name(prodRequest.name())
			    .description(prodRequest.description())
			    .price(prodRequest.price())
			    .build();
		
		productRepository.save(product);
		
		log.info("Product created successfully");
		return product;
	}
	
	
	
	
}
