package org.dnyanyog.common;

public enum ResponseCode {
	INVALID_USERNAME_PASSWORD(0001, "Fail", "Username & Password Do Not Match"),
	LOGIN_SUCCESS(0000, "Success", "Login successful"),
	USER_NOT_PRESENT(0001, "Fail", "User Not found"),
	ADD_USER_SUCCESS(0000, "Success", "User added successfully"),
	USER_FOUND(0000, "Success", "User found"),
	USER_UPDATE_SUCCESS(0000, "Success", "User Updated");
	


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
