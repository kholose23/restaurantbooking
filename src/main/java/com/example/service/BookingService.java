package com.example.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;

import com.example.exception.BookingNotFoundException;
import com.example.persistence.domain.Booking;
import com.example.persistence.repository.BookingRepository;

@Service
public class BookingService {
	BookingRepository BookRepo;

	private Mapper mapper;

	public BookingRepository getBookRepo() {
		return BookRepo;
	}

	public void setBookRepo(BookingRepository bookRepo) {
		BookRepo = bookRepo;
	}

	public Mapper getMapper() {
		return mapper;
	}

	public void setMapper(Mapper mapper) {
		this.mapper = mapper;
	}

	public BookingService(BookingRepository bookRepo, Mapper mapper) {
		super();
		BookRepo = bookRepo;
		this.mapper = mapper;
	}

	public BookingService() {
		super();
	}
	public Booking createMusician(Booking Musician) {
		return this.BookRepo.save(Musician);
	}

	public List<Booking> readAllBooking() {
		return this.BookRepo.findAll();
	}

	public Optional<Booking> readOneMusician(Long id) throws BookingNotFoundException
	{
		return Optional.ofNullable(this.bookRepo.findById.orElseThrow(()->new BookingNotFoundException())); 
				
	}

	public Booking updateMusician(Booking musician, Long id)
	{
		Optional<Booking> x=this.bookRepo.findById(id);
		Booking foundBookings=x.get();
		foundBooking.setName(Booking,'getName();
		foundBooking.setString(booking,getStrings();
		foundBooking.setType(booking,getType();
		foundBooking.setCustomer(Booking,getCustomer();
		this.bookRepo.save(Booking);
		return foundBooking;
	}
}
