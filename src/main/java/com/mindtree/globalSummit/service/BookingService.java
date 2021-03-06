package com.mindtree.globalSummit.service;

import java.util.List;
import java.util.Optional;

import com.mindtree.globalSummit.entity.Booking;

public interface BookingService {

	public void addBooking(Booking booking);

	// public void deleteBooking(Booking booking);

	public List<Booking> getAllBooking();

	public Optional<Booking> getBooking(int id);

	public List<Booking> getAllLuxuryBooking();

	public List<Booking> getAllSemiLuxuryBooking();

	public List<Booking> getAllBudgetBooking();

}
