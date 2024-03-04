package org.customer.dto;

import org.springframework.stereotype.Component;

@Component
public class DiscountResponse {
	private long discountPercentage;

	public long getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(long discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

}
