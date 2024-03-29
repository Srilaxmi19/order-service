package com.olive.os.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olive.os.api.entity.Order;
import com.olive.os.api.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
		
	}

	public List<Order> getAll()
	{
		return orderRepository.findAll();
	}
}
