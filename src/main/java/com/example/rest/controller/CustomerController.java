package com.example.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistence.domain.Customer;
import com.example.service.CustomerService;

@RestController 
@RequestMapping("/Customer")
public class CustomerController {
	@Autowired
	CustomerService serviceCustomer;
	
	@PostMapping("/create")
	public ResponseEntity<Customer> create(@RequestBody Customer customer) {
		return new ResponseEntity<>(this.serviceCustomer.createCustomer(customer), HttpStatus.CREATED);
	}
	@GetMapping("/readAll")
	public ResponseEntity<List<Customer>> read() {
		return ResponseEntity.ok(this.serviceCustomer.readAllCustomer());
}
     @GetMapping("/readOne/{id}")
	 public ResponseEntity<Optional<Customer>> readId(@PathVariable Long id) {
		return ResponseEntity.ok(this.serviceCustomer.readById(id)); }
		
	 @PutMapping("/update/{id}")
		public ResponseEntity<Customer> update(@RequestBody Customer customer, @PathVariable Long id) {
			return new ResponseEntity<>(this.serviceCustomer.updateCustomer(customer, id), HttpStatus.ACCEPTED);
     }
	 @DeleteMapping("/delete/{id}")
		public boolean delete(@PathVariable Long id) {
			return this.serviceCustomer.deleteCustomer(id);
     }
	 
	/* @GetMapping("/findCustomerByName/{name}")
		public ResponseEntity<List<Customer>> readCustomerByName(@PathVariable String name) {
			return ResponseEntity.ok(this.serviceCustomer.readCustomerByName(name, name));
	}
	@GetMapping("/findCustomerByBooking/{Booking}")
		public ResponseEntity<List<Customer>> reaCustomerByString(@PathVariable String Booking) {
			
			return ResponseEntity.ok(this.serviceCustomer.readCustomerByBookings(Booking));
		}*/
		}
