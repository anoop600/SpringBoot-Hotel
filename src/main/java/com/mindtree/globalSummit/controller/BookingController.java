package com.mindtree.globalSummit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.globalSummit.entity.Booking;
import com.mindtree.globalSummit.service.BookingService;

@RestController
public class BookingController {
	@Autowired
	BookingService bookingService;

	@RequestMapping(method = RequestMethod.POST, value = "/addBooking")
	public void addHotel(@RequestBody Booking booking) {
		bookingService.addBooking(booking);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getBooking/{id}")
	public void addHotel(@RequestBody int id) {
		bookingService.getBooking(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getAllBooking")
	public List<Booking> getAllBooking() {
		return bookingService.getAllBooking();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/luxury")
	public List<Booking> getAllLuxuryBooking() {
		return bookingService.getAllLuxuryBooking();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/semi")
	public List<Booking> getAllSemiLuxuryBooking() {
		return bookingService.getAllSemiLuxuryBooking();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/budget")
	public List<Booking> getAllBudgetBooking() {
		return bookingService.getAllBudgetBooking();
	}
}
