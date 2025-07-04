package com.techie.microservices.order.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_orders")
@AllArgsConstructor
@NoArgsConstructor
public class Order {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
}
