package com.example.hotelservice.exception;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.Xa;

public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException(String s) {
		super(s);
		
	}
	public ResourceNotFoundException() {
		super("Resource Not Found");
	}

}
