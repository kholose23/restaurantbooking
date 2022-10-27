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

import com.example.persistence.domain.Booking;
import com.example.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService serviceBooking;

	@PostMapping("/createBooking")
	public ResponseEntity<Booking> create(@RequestBody Booking musician) {
		return new ResponseEntity<>(this.serviceBooking.createMusician(musician), HttpStatus.CREATED);
	}
	@GetMapping("/readAllBooking/{id}")
	public ResponseEntity<List<Booking>> read() {
		return ResponseEntity.ok(this.serviceBooking.readAllBooking());
		
	}
	@GetMapping("/readOneBooking/{id}")
	public ResponseEntity<Optional<Booking>> readId(@PathVariable Long id) {
		return ResponseEntity.ok(this.serviceBooking.readOneMusician(id));
	}
	@PutMapping("/updateBooking/{id}")
	public ResponseEntity<Booking> update(@RequestBody Booking musician, @PathVariable Long id) {
		return new ResponseEntity<>(this.serviceBooking.updateBooking(serviceBooking,id), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/Musician/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		return ResponseEntity.ok(this.serviceBooking.deleteBooking(id));
	}
	
	@GetMapping("/findMusicianByName/{name}")
	public ResponseEntity<List<Booking>> readMusicianByName(@PathVariable String name) {
		return ResponseEntity.ok(this.serviceBooking.readByBookingName(name));
	}

	@GetMapping("/findMusicianByString/{String}")
	public ResponseEntity<List<Booking>> readBookingByString(@PathVariable Integer String) {
		return ResponseEntity.ok(this.serviceBooking.readBookingByString(String));
	}

	@GetMapping("/findMusicianByType/{String}")
	public ResponseEntity<List<Booking>> readMusicianByType(@PathVariable String Type) {
		return ResponseEntity.ok(this.serviceBooking.readBookingByType(Type));

	}
}

