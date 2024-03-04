package org.customer.dto;

import org.springframework.stereotype.Component;

@Component
public class DiscountRequest {
	long age;

	String gender;

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
