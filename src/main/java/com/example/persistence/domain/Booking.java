package com.example.persistence.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String Types;
	
	@NotNull
	private String Time;
	
	@NotNull
	private String Date;
	
	@ManyToOne
	private Customer customer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypes() {
		return Types;
	}

	public void setTypes(String types) {
		Types = types;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Booking(Long id, @NotNull String types, @NotNull String time, @NotNull String date, Customer customer) {
		super();
		this.id = id;
		Types = types;
		Time = time;
		Date = date;
		this.customer = customer;
	}

	public Booking() {
		super();
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", Types=" + Types + ", Time=" + Time + ", Date=" + Date + ", customer=" + customer
				+ "]";
	}
	
	
	

}
