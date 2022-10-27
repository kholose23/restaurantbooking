package com.example.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Musician does not exist with that ID")
public class BookingNotFoundException extends EntityNotFoundException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7008186545567685822L;
	
	public BookingNotFoundException() {
	
	}
	
	public BookingNotFoundException(String msg) {
		super(msg);
	}

}


