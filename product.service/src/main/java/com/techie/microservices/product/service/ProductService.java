package com.techie.microservices.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techie.microservices.product.dto.ProductRequest;
import com.techie.microservices.product.dto.ProductResponse;
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
	
	public ProductResponse createProduct(ProductRequest prodRequest) {
	//Product p = new Product(prodRequest.id(),prodRequest.name(),prodRequest.description(),prodRequest.price());
		
		Product product = Product.builder()
			    .name(prodRequest.name())
			    .description(prodRequest.description())
			    .price(prodRequest.price())
			    .build();
		
		productRepository.save(product);
		
		log.info("Product created successfully");
		return new ProductResponse(product.getId(),product.getName(),product.getDescription(),product.getPrice());
	}
	
	public List<ProductResponse> getAllProducts(){
		return productRepository.findAll()
				.stream()
				.map(product -> new ProductResponse(product.getId(),product.getName(),product.getDescription(),product.getPrice()))
				.toList();	
	}
	
	
	
}
