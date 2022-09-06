package com.tourplanner.entities;

import java.time.LocalDate;

public interface DetailsTrip {

	String getSource();	
	String getDestination();
	int getDays();
	String getTripName();
	double getEstimatedCost();
	
}
