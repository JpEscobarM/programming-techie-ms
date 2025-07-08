create table t_orders (price decimal(38,2), quantity integer, id bigint not null auto_increment, order_number varchar(255), sku_code varchar(255), primary key (id)) engine=InnoDB;
