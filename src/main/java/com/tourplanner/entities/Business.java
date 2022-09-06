package com.tourplanner.entities;

import java.time.LocalDate;

public class Business {
	
	// class base projection i.e mandatory Allargs contructor
	private String source;
	private String destination;
	private int days;
	private LocalDate plannedDate;
	
	public Business(String source, String destination, int days, LocalDate plannedDate) {
		
		this.source = source;
		this.destination = destination;
		this.days = days;
		this.plannedDate = plannedDate;
	}
	
	public LocalDate getPlannedDate() {
		return plannedDate;
	}

	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	public int getDays() {
		return days;
	}
	
}
