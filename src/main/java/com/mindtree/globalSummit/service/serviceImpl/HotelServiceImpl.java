package com.mindtree.globalSummit.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.globalSummit.entity.Hotel;
import com.mindtree.globalSummit.repository.HotelRepository;
import com.mindtree.globalSummit.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepository hotelRepository;

	@Override
	public void addHotel(Hotel hotel) {
		hotelRepository.save(hotel);
	}

	@Override
	public Optional<Hotel> getHotel(int hotelId) {
		return hotelRepository.findById(hotelId);
	}

	@Override
	public List<Hotel> getAllHotel() {
		List<Hotel> allHotel=new ArrayList<Hotel>();
		hotelRepository.findAll().forEach(allHotel::add);
		return allHotel;
	}

}
