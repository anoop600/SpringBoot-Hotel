package com.mindtree.globalSummit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hotelId;
	private String hotelName;
	private int totalRoom;
	private int tarrif;

	public int getTarrif() {
		return tarrif;
	}

	public void setTarrif(int tarrif) {
		this.tarrif = tarrif;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getTotalRoom() {
		return totalRoom;
	}

	public void setTotalRoom(int totalRoom) {
		this.totalRoom = totalRoom;
	}

}
