package com.example.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.persistence.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query(value = "Select * from Customer where name =?2", nativeQuery = true)
	List<Customer> findBandByName(String name);

	@Query(value = "Select * from Booking where genre=?2 and release_year>?2", nativeQuery = true)
	List<Customer> findBandByString(Integer Strings);

}
