package com.tourplanner.entities;

import org.springframework.beans.factory.annotation.Value;

public interface HolidayTrip {

	//Opened Projection
	@Value("#{target.tripName}")
	String getVacationname();
	@Value("#{target.source}")
	String getHolidaySource();
	@Value("#{target.destination}")
	String getHolidayDestination();
	@Value("#{target.days}")
	int getHolidayDays();
	
}
