package com.example.rest.dto;

public class CustomerDTO {
	private Long Id;
	private String CustomerNames;
	private String Email;
	private Long Phone;
	private Long Username;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getCustomerNames() {
		return CustomerNames;
	}
	public void setCustomerNames(String customerNames) {
		CustomerNames = customerNames;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getPhone() {
		return Phone;
	}
	public void setPhone(Long phone) {
		Phone = phone;
	}
	public Long getUsername() {
		return Username;
	}
	public void setUsername(Long username) {
		Username = username;
	}
	public CustomerDTO(Long id, String customerNames, String email, Long phone, Long username) {
		super();
		Id = id;
		CustomerNames = customerNames;
		Email = email;
		Phone = phone;
		Username = username;
	}
	public CustomerDTO() {
		super();
	}
	@Override
	public String toString() {
		return "CustomerDTO [Id=" + Id + ", CustomerNames=" + CustomerNames + ", Email=" + Email + ", Phone=" + Phone
				+ ", Username=" + Username + "]";
	}
	

}
