package com.olive.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.olive.os.api.entity.Order;
import com.olive.os.api.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	
	@PostMapping("/add")
    public Order bookOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);

	}

	@GetMapping("all")
	public List<Order> getAll(){
		return orderService.getAll();
	}

}
