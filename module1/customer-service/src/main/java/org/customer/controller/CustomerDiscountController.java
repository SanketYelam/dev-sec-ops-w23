package org.customer.controller;

import org.customer.dto.DiscountRequest;
import org.customer.dto.DiscountResponse;
import org.customer.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDiscountController {

	@Autowired
	CustomerServiceImpl discountService;

	@Autowired
	public CustomerDiscountController(CustomerServiceImpl discountService) {
		this.discountService = discountService;
	}

	@PostMapping("/api/v1/customer/getDiscount")
	public DiscountResponse getDiscount(@RequestBody DiscountRequest request) {
		return discountService.calculateDiscount(request);
	}

}