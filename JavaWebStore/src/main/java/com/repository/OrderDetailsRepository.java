package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.OrderDetails;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer> {

}
