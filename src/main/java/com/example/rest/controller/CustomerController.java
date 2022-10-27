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
import org.springframework.web.bind.annotation.RestController;

import com.example.persistence.domain.Customer;
import com.example.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService serviceCustomer;
	
	@PostMapping("/createBand")
	public ResponseEntity<Customer> create(@RequestBody Customer Band) {
		return new ResponseEntity<>(this.serviceCustomer.createCustomer(Customer), HttpStatus.CREATED);
	}
	@GetMapping("/readAllBand/")
	public ResponseEntity<List<Customer>> read() {
		return ResponseEntity.ok(this.serviceCustomer.readAllBand());
}
     @GetMapping("/readOneCustomer/{id}")
	 public ResponseEntity<Optional<Customer>> readId(@PathVariable Long id) {
		return ResponseEntity.ok(this.serviceCustomer.readOneCustomer(id));
		
	 @PutMapping("/updateCustomer/{id}")
		public ResponseEntity<Customer> update(@RequestBody Customer Customer, @PathVariable Long id) {
			return new ResponseEntity<>(this.serviceCustomer.updateCustomer(Customer, id), HttpStatus.ACCEPTED);
     }
	 @DeleteMapping("/delete/Customer/{id}")
		public ResponseEntity<?> delete(@PathVariable Long id) {
			return ResponseEntity.ok(this.serviceCustomer.deleteBand(id));
     }
	 @GetMapping("/findCustomerByName/{name}")
		public ResponseEntity<List<Customer>> readCustomerByName(@PathVariable String name) {
			return ResponseEntity.ok(this.serviceCustomer.readCustomerByName(name, name));
	}
	@GetMapping("/findCustomerByBooking/{}")
		public ResponseEntity<List<Customer>> reaCustomerByString(@PathVariable String Musician) {
			return ResponseEntity.ok(this.serviceCustomer.readCustomerByBookings(Booking));
		}
		
	}
