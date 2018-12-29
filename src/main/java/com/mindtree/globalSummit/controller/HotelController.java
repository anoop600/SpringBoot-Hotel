package com.mindtree.globalSummit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.globalSummit.entity.Hotel;
import com.mindtree.globalSummit.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;

	@RequestMapping(method = RequestMethod.POST, value = "/addHotel")
	public void addHotel(@RequestBody Hotel hotel) {
		hotelService.addHotel(hotel);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/addHotel/{hotelId}")
	public Optional<Hotel> getHotelById(@PathVariable int hotelId) {
		return hotelService.getHotel(hotelId);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/addAllHotel/")
	public List<Hotel> getAllHotel() {
		return hotelService.getAllHotel();
	}

}
