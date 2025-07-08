create table t_orders
(
	 id bigint not null auto_increment,
	 order_number varchar(255) DEFAULT NULL,
	sku_code varchar(255),
	price decimal(38,2),
 	quantity integer,
    primary key (id)
);