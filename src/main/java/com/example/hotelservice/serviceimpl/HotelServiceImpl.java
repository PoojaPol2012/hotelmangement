package com.example.hotelservice.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotelservice.entities.Hotel;
import com.example.hotelservice.exception.ResourceNotFoundException;
import com.example.hotelservice.respositories.HotelRespository;
import com.example.hotelservice.services.HotelService;
@Service
public class HotelServiceImpl  implements HotelService{
	@Autowired
	 private HotelRespository  hotelRespository;

	@Override
	public Hotel create(Hotel hotel) {
		String hotelId=UUID.randomUUID().toString();
		hotel.setId(hotelId);
		
		return hotelRespository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		
		return hotelRespository.findAll();
	}

	@Override
	public Hotel get(String id) {
		
		return hotelRespository.findById(id).orElseThrow(()-> new ResourceNotFoundException (" hotel with given id is not found"));
	}

	
}
