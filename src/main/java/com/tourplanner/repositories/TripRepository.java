package com.tourplanner.repositories;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tourplanner.entities.Trip;

public interface TripRepository extends JpaRepository<Trip, Integer> {

	List<Trip> findByTripNo(int tripNo);
	List<Trip> findBySourceAndDestination(String source,String destination);
	List<Trip> findBySourceOrDestination(String source,String destination);
	List<Trip> findByTripNoBetween(int min,int max);
	List<Trip> findBySourceIsNull();
	List<Trip> findBySourceStartingWith(String startingwith);
	List<Trip> findByDestinationContaining(String contain);
	List<Trip> findByTripNoAfter(int number);
	
	List<Trip> findByPlannedDateAfter(LocalDate plannedDate);
	List<Trip> findByPlannedDateBefore(LocalDate plannedDate);
	long countByDaysGreaterThan(int days);
	List<Trip> findByDaysGreaterThan(int days);
	List<Trip> findBySourceIn(Collection<String> string);
	List<Trip> findByTripNameLike(String name);
	List<Trip> findBySourceOrderByDays(String source);
	
}
