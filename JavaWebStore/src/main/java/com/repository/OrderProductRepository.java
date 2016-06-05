package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.OrderProduct;

public interface OrderProductRepository extends CrudRepository<OrderProduct, Integer> {

}
