package com.spring.Di;

public class User implements UserType {
	private String name;
	private String email;

	@Override
	public void type() {

		System.out.print("Iam man");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
