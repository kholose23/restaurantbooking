package com.example.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 0, max = 70)
	private String name;
	
	@NotNull
	@Size(min = 0, max = 70)
	private String Email;
	
	@NotNull
	@Size(min = 0, max = 30)
	private Long Phone;
	
	@Size(min = 0, max = 30)
	private String Username;
	
	@Size(min = 10, max = 40)
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

	public Customer(Long id, @NotNull @Size(min = 0, max = 70) String name,
		@NotNull @Size(min = 0, max = 70) String email, @NotNull @Size(min = 0, max = 30) Long phone,
		@Size(min = 0, max = 30) String username, @Size(min = 10, max = 40) String password) {
		super();
		this.id = id;
		this.name = name;
		Email = email;
		Phone = phone;
		Username = username;
		Password = password;
	}

		
	

}
