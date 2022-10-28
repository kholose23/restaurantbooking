package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.persistence.domain.Booking;
import com.example.persistence.repository.BookingRepository;

@Service
public class BookingService {
	@Autowired
	BookingRepository BookRepo;

	// @Autowired
	// private ModelMapper mapper;

	public BookingRepository getBookRepo() {
		return BookRepo;
	}

	public void setBookRepo(BookingRepository bookRepo) {
		BookRepo = bookRepo;
	}

	public Booking createBooking(Booking booking) {
		return this.BookRepo.save(booking);
	}

	public Optional<Booking> readOneById(Long id) {
		return this.BookRepo.findById(id);

	}

	public boolean deleteBooking(Long Id) {
		this.BookRepo.deleteById(Id);
		return !this.BookRepo.existsById(Id);
	}

	public  Booking updateBookingService(Booking booking,Long Id) {
			Booking existing = this.BookRepo.findById(Id).get();
			existing.setTime(booking.getTime());
			existing.setDate(booking.getDate());
			existing.setTypes(booking.getTypes());
			existing.setCustomer(booking.getCustomer());
			existing.setId(booking.getId());

			return this.BookRepo.save(existing);
		}

	public List<Booking> readAllBooking() {
		return this.BookRepo.findAll();
	}
	/*
	 * public BookingService(BookingRepository bookRepo, Mapper mapper) { super();
	 * BookRepo = bookRepo; this.mapper = mapper; }
	 */

}
