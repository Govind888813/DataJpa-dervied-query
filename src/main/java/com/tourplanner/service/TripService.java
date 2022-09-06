package com.tourplanner.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tourplanner.dto.TripDto;
import com.tourplanner.entities.Trip;
import com.tourplanner.repositories.TripRepository;

@Service
public class TripService {
	@Autowired
	private TripRepository tripRepository;

	@Transactional(readOnly = false)
	public int newTrip(TripDto tripDto) {
		Trip trip = null;

		trip = Trip.builder().build();
		BeanUtils.copyProperties(tripDto, trip);
		trip = tripRepository.save(trip);
		return trip.getTripNo();
	}

	@Transactional(readOnly = true)
	public List<TripDto> getAllTrips() {
		return tripRepository.findAll().stream().map(e -> {
			TripDto dto = new TripDto();
			BeanUtils.copyProperties(e, dto);
			return dto;
		}).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public TripDto findTrip(int tripNo) {
		TripDto tripDto = null;

		Optional<Trip> trip = tripRepository.findById(tripNo);
		if (trip.isPresent()) {
			tripDto = new TripDto();
			BeanUtils.copyProperties(trip, tripDto);
		}
		return tripDto;
	}

	@Transactional(readOnly = false)
	public void deleteTrip(int tripNo) {
		Trip trip = null;

		trip = Trip.builder().tripNo(tripNo).build();
		tripRepository.delete(trip);
	}

	public List<TripDto> getAllTrips(int pageSize, int pageNo) {
		return tripRepository.findAll(Pageable.ofSize(pageSize).withPage(pageNo)).stream().map(e -> {
			TripDto dto = new TripDto();
			BeanUtils.copyProperties(e, dto);
			return dto;
		}).collect(Collectors.toList());
	}

	public List<TripDto> getTrips(String sortColumn) {
		return tripRepository.findAll(Sort.by(sortColumn)).stream().map(e -> {
			TripDto dto = new TripDto();
			BeanUtils.copyProperties(e, dto);
			return dto;
		}).collect(Collectors.toList());
	}
	
	
	public TripDto findId(int tripNo){
		TripDto dto = new TripDto();
		List<Trip> trip = tripRepository.findByTripNo(tripNo);
		System.out.println(trip);
		BeanUtils.copyProperties(trip, dto);
		return dto;
	}
	
	public List<TripDto> sourceAndDestination(String source,String destination){
		return tripRepository.findBySourceAndDestination(source, destination).stream().map(e->{
			TripDto dto=new TripDto();
			BeanUtils.copyProperties(e, dto);
			return dto;
		}).collect(Collectors.toList());
	}
	
	public List<TripDto> sourceOrDestination(String source,String destination){
		return tripRepository.findBySourceOrDestination(source, destination).stream().map(e->{
			TripDto dto=new TripDto();
			BeanUtils.copyProperties(e, dto);
			return dto;
		}).collect(Collectors.toList());
	}
		
		
		
	     public	List<TripDto> tripNoBetween(int min,int max){
			return tripRepository.findByTripNoBetween(min, max).stream().map(e->{
				TripDto dto =new TripDto();
				BeanUtils.copyProperties(e, dto);
				return dto;
			}).collect(Collectors.toList());
		}
	     
	     public List<TripDto> sourceNull(){
	    	 return tripRepository.findBySourceIsNull().stream().map(e->{
					TripDto dto =new TripDto();
					BeanUtils.copyProperties(e, dto);
					return dto;
				}).collect(Collectors.toList());
	     }
		
		

	     public List<TripDto> sourceStartWith(String start){
	    	 return tripRepository.findBySourceStartingWith(start).stream().map(e->{
					TripDto dto =new TripDto();
					BeanUtils.copyProperties(e, dto);
					return dto;
				}).collect(Collectors.toList());
	     }
	
	     public List<TripDto> destinationContaion(String contain){
	    	 return tripRepository.findByDestinationContaining(contain).stream().map(e->{
					TripDto dto =new TripDto();
					BeanUtils.copyProperties(e, dto);
					return dto;
				}).collect(Collectors.toList());
	     }
	
	     public List<TripDto> tripNoAfter(int after){
	    	 return tripRepository.findByTripNoAfter(after).stream().map(e->{
					TripDto dto =new TripDto();
					BeanUtils.copyProperties(e, dto);
					return dto;
				}).collect(Collectors.toList());
	     }
	     
	     @Transactional(readOnly = false)
	     public int updateSourceAndDestinationByNo(int no,String source,String destination){
	    	 return tripRepository.updaTripSOurceAndDestinationByTripNo(no, source, destination);
	     }
	
}
