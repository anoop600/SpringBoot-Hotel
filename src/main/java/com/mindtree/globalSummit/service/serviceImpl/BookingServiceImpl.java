package com.mindtree.globalSummit.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.globalSummit.entity.Booking;
import com.mindtree.globalSummit.repository.BookingRepository;
import com.mindtree.globalSummit.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	BookingRepository bookingRepository;
	List<Booking> listBooking = new ArrayList<Booking>();

	@Override
	public void addBooking(Booking booking) {
		bookingRepository.save(booking);
	}

	@Override
	public List<Booking> getAllBooking() {
		listBooking = new ArrayList<>();
		bookingRepository.findAll().forEach(listBooking::add);
		// System.out.println(listBooking);
		return listBooking;
	}

	@Override
	public List<Booking> getAllLuxuryBooking() {
		return getAllBooking().stream().filter(e -> e.getRoomType().equalsIgnoreCase("luxury"))
				.collect(Collectors.toList());
	}

	@Override
	public List<Booking> getAllSemiLuxuryBooking() {
		return getAllBooking().stream().filter(e -> e.getRoomType().equalsIgnoreCase("semiluxury"))
				.collect(Collectors.toList());
	}

	@Override
	public List<Booking> getAllBudgetBooking() {
		return getAllBooking().stream().filter(e -> e.getRoomType().equalsIgnoreCase("Budget"))
				.collect(Collectors.toList());
	}

	@Override
	public Optional<Booking> getBooking(int id) {
		return bookingRepository.findById(id);
	}

}
