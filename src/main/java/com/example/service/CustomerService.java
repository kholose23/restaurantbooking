 package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persistence.domain.Customer;
import com.example.persistence.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository CustomerRepo;

//@Autowired	
//private ModelMapper mapper;
	/*
	 * private CustomerDTO mapToDTO(Customer customer) { return this.mapper.map() }
	 */
	public Optional<Customer> readById(Long id) {
		return this.CustomerRepo.findById(id);

	}

	public Customer createCustomer(Customer customer) {
		return this.CustomerRepo.save(customer);
	}

	public List<Customer> readAllCustomer() {
		return this.CustomerRepo.findAll();

	}

	public Customer updateCustomer(Customer customer, Long Id) {
		Customer existing = this.CustomerRepo.findById(Id).get();
		existing.setEmail(customer.getEmail());
		existing.setName(customer.getName());
		existing.setPassword(customer.getPassword());
		existing.setPhone(customer.getPhone());
		existing.setUsername(customer.getUsername());

		return this.CustomerRepo.save(existing);

	}

	public boolean deleteCustomer(Long Id) {
		this.CustomerRepo.deleteById(Id);
		return !this.CustomerRepo.existsById(Id);
	}
}
