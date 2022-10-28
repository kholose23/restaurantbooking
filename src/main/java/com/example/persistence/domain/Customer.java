package com.example.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	
	private String name;
	
	
	
	private String Email;
	

	private Long Phone;
	
	
	private String Username;
	
	
	private String Password;
	//@JsonManagedReference
    @JsonIgnore
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
	@OnDelete(action = OnDeleteAction.CASCADE)
	 private List<Booking> booking = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Customer(Long id, String name, String email, Long phone, String username, String password,
			List<Booking> booking) {
		super();
		this.id = id;
		this.name = name;
		Email = email;
		Phone = phone;
		Username = username;
		Password = password;
		this.booking = booking;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	}

		
	


