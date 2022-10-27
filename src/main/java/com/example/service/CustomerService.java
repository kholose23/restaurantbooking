package com.example.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.example.persistence.domain.Customer;
import com.example.persistence.repository.CustomerRepository;
import com.example.rest.dto.CustomerDTO;

@Service
public class CustomerService<ModelMapper> {

CustomerRepository CustomerRepo;
	
private ModelMapper mapper;
	
public CustomerDTO readById(Long id) {
	Customer found =this.CustomerRepo.findById(id) or ElseThrow(CustomerNotFoundException::new );

}
private CustomerDTO mapToDTO(Customer found) {
	//TODO Auto-generated method stub
	return null;
	
	public Customer createCustomer(Customer customer) //Band will be added from POSTMAN Body
	{
		return this.CustomerRepo.save(customer);
	}
	public List<Customer> readAllBand()
	{
		return this.CustomerRepo.findAll();
	}
	public Optional<Customer> readOneCustomer(Long id) throws CustomerNotFoundException;{
	{
		return Optional.ofNullable(this.BandRepo.findById(id).orElseThrow(()->new CustomerNotFoundException()));
	}
	public Customer updateBand(Customer customer, Long id)
	{
		Optional<Customer> x=this.CustomerRepo.findById(id);
		Customer foundCustomer=x.get();
		foundCustomer.setName(Customer.getName());
		foundCustomer.setMusicians(customer.getCustomers());
		this.CustomerRepo.save(Customer);
		return foundCustomer;
	}
	public boolean deleteBand(Long id)
	{
		this.CustomerRepo.deleteById(id);
		return !this.CustomerRepo.existsById(id);
		
	}
	public List<Customer> readCustomerByName(String name, Object String)
	{
		return this.CustomerRepo.CustomerRepofindByName(name);
	}
	public List<Customer> readCustomerByMusicians(String Customers)
	{
		return this.CustomerRepo.findCustomerByName(Customers);
		
	}

}
	


