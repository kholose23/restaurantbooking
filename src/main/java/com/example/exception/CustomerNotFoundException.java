package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Customer does not exist with that ID")
public class CustomerNotFoundException {

	public CustomerNotFoundException() {}
	public CustomerNotFoundException(String msg) {
			super();
		}
}