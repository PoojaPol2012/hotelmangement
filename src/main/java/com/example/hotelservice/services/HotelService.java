package com.example.hotelservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hotelservice.entities.Hotel;

public interface HotelService {
	//create
	Hotel create(Hotel hotel);
	//get all
	
	List<Hotel> getAll();
	// get single
	
	Hotel get(String id);
	
	

}
