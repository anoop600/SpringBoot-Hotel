package com.mindtree.globalSummit;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.globalSummit.entity.Booking;
import com.mindtree.globalSummit.service.BookingService;

public class TestService {

	@Autowired
	private BookingService bookingService;
	static Booking booking = new Booking();

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void before() {
		System.out.println("Before Test");

		booking.setBookingId(1);
		booking.setHotelId(1);
		booking.setCustomerId(1);
		booking.setRoomType("luxury");
		booking.setCheckIn("11-11-1111");
		booking.setCheckOut("11-11-1111");

	}

	@Test
	public void test() {
		Assert.assertNotNull(booking);
		Assert.assertEquals(1, booking.getBookingId());
		Assert.assertEquals(1, booking.getCustomerId());
		Assert.assertEquals(1, booking.getHotelId());
	}

}
