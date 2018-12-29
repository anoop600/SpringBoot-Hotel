package com.mindtree.globalSummit.service;

import java.util.List;
import java.util.Optional;
import com.mindtree.globalSummit.entity.Hotel;

public interface HotelService {
	public void addHotel(Hotel hotel);

	public Optional<Hotel> getHotel(int hotelId);

	public List<Hotel> getAllHotel();
}
