package com.example.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.persistence.domain.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

	@Query(value = "Select * from Booking where space = ?10", nativeQuery = true)
	List<Booking> findBookingByName(String name);
	@Query(value = "Select *from Customer where resevation=?10 and cancellation is made>?10",nativeQuery = true)
	List<Booking> findBookingByString(Integer Strings);

}
