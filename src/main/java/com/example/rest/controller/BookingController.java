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

import com.example.persistence.domain.Booking;
import com.example.service.BookingService;

@RestController
@RequestMapping("/Booking")
public class BookingController {
	
	@Autowired
	BookingService serviceBooking;

	@PostMapping("/create")
	public ResponseEntity<Booking> create(@RequestBody Booking booking) {
		return new ResponseEntity<>(this.serviceBooking.createBooking(booking), HttpStatus.CREATED);
	}
	@GetMapping("/readAll/{id}")
	public ResponseEntity<List<Booking>> read() {
		return ResponseEntity.ok(this.serviceBooking.readAllBooking());
		
	}
	@GetMapping("/readOne/{id}")
	public ResponseEntity<Optional<Booking>> readId(@PathVariable Long id) {
		return ResponseEntity.ok(this.serviceBooking.readOneById(id));
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Booking> update(@RequestBody Booking Customer, @PathVariable Long id) {
		return new ResponseEntity<>(this.serviceBooking.updateBookingService(Customer, id), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		return ResponseEntity.ok(this.serviceBooking.deleteBooking(id));
	}
	
	/*@GetMapping("/findBookingByName/{name}")
	public ResponseEntity<List<Booking>> readBookingByName(@PathVariable String name) {
		return ResponseEntity.ok(this.serviceBooking.readByBookingName(name));
	}

	@GetMapping("/findBookingByString/{String}")
	public ResponseEntity<List<Booking>> readBookingByString(@PathVariable Integer String) {
		return ResponseEntity.ok(this.serviceBooking.readBookingByString(String));
	}

	@GetMapping("/findBookingByType/{String}")
	public ResponseEntity<List<Booking>> readBookingByType(@PathVariable String Type) {
		return ResponseEntity.ok(this.serviceBooking.readBookingByType(Type));
*/
	}


