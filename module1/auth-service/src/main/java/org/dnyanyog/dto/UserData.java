package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class UserData {

	@NotNull(message = "Username must required")
	@NotBlank(message = "Username Should Not blank")
	@Size(min = 5, max = 20, message = "Validation error:Username should be minimum 5 to 20 characters")
	private String username;

	@NotNull(message = "Password must required")
	@NotBlank(message = "Password Should Not blank")
	@Size(min = 5, max = 20, message = "Validation error:Usernameshould be minimum 5 to 20 characters")
	private String password;

	@NotNull(message = "Email must required")
	@NotBlank(message = "Email Should Not blank")
	@Email(message = "Enter valid Email")
	private String email;

	@NotNull(message = "Age must required")
	@NotBlank(message = "Age Should Not blank")
	@Positive(message = "Enter Positive Integer Age")
	private String age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
