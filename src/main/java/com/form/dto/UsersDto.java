package com.form.dto;

public class UsersDto {

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

	public UsersDto(String password, String confPassword, String name, String email) {
		super();

		this.password = password;
		this.confPassword = confPassword;
		this.name = name;
		this.email = email;
	}

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfPassword() {
		return confPassword;
	}

	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}

	private String confPassword;

	private String name;

	private String email;

}
