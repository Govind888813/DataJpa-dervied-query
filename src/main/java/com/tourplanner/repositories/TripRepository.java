package com.tourplanner.repositories;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tourplanner.entities.Business;
import com.tourplanner.entities.HolidayTrip;
import com.tourplanner.entities.QuickTrip;
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
	
	@Modifying
	@Query("update Trip trip set trip.source=:source,trip.destination=:destination where trip.tripNo=:tpNo")
	int updaTripSOurceAndDestinationByTripNo(@Param("tpNo") int tpNo,@Param("source")String source,@Param("destination")String destination);
	
	List<QuickTrip> findByDays(int days);
	List<HolidayTrip> findByDaysBetween(int min,int max);
	List<HolidayTrip> findByDaysBetweenOrderByDays(int min,int max);
	
	List<Business> findByPlannedDateBetween(LocalDate startDate,LocalDate endDate);
	
    <T> List<T> findByTripNameLike(String tripnamelike,Class<T> entityType);
	
}
