package com.mindtree.globalSummit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.mindtree.globalSummit.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
