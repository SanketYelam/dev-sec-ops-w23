package org.customer.common;

public enum ResponseCode {
	INVALID_INPUT(0001, "Error", "Email is already exist! Please enter valid emailID"),
	CUSTOMER_ADD_SUCCESS(0000, "Success", "Customer added successfully!!"),
	CUSTOMER_NOT_PRESENT(0001, "Fail", "Customer not found !!"),
	GET_CUSTOMER_PRESENT(0000, "Success", "Customer details are as follows :");

	private final String status;
	private final String message;
	private final long code;

	ResponseCode(long code, String status, String message) {
		this.code = code;
		this.status = status;
		this.message = message;
	}

	public long getCode() {
		return code;
	}

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

}
