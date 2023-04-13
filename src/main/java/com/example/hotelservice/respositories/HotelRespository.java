package com.example.hotelservice.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotelservice.entities.Hotel;
@Repository
public interface  HotelRespository  extends JpaRepository<Hotel, String>{

}
