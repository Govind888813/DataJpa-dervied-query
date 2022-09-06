package com.tourplanner.test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.SystemPropertyUtils;

import com.tourplanner.config.RootConfig;
import com.tourplanner.dto.TripDto;
import com.tourplanner.entities.BasicTrip;
import com.tourplanner.entities.DetailsTrip;
import com.tourplanner.repositories.DeliveryAssociateRepository;
import com.tourplanner.repositories.ParcelRepository;
import com.tourplanner.repositories.TripRepository;
import com.tourplanner.service.TripService;

public class TourPlannerTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		TripService tripService = context.getBean(TripService.class);
		 System.out.print("fd");
		 System.out.println(System.getProperty("line.separator"));
		 System.out.println("fd");
//		TripDto tripDto = TripDto.builder().source("Hyderabad").destination("Jaipur").tripName("Jaipur Trip")
//				.plannedDate(LocalDate.of(2022, 10, 29)).estimatedCost(150000).days(7).build();
//		int tripNo = tripService.newTrip(tripDto);
//		System.out.println("tripNo : " + tripNo);
//		TripDto tripDto = tripService.findTrip(2);
//		System.out.println(tripDto);
//		 tripService.deleteTrip(2);
//		 tripService.getAllTrips().forEach(System.out::println);
//		 tripService.getAllTrips(5, 1).forEach(System.out::println);
//		tripService.getTrips("days").forEach(System.out::println);
//		TripDto findId = tripService.findId(2);
//		System.out.println(findId.getTripName());
		
		
//		 tripService.sourceAndDestination("nanded", "pune").forEach(System.out::println);
//		 tripService.sourceOrDestination("nanded", "pune").forEach(System.out::println);
//		 tripService.tripNoBetween(3, 5).forEach(System.out::println);
//		 tripService.sourceNull().forEach(System.out::println);
		 
//		 tripService.sourceStartWith("n").forEach(System.out::println);
//		 tripService.destinationContaion("ip").forEach(System.out::println);
//		 tripService.tripNoAfter(5).forEach(System.out::println);
//		 System.out.println();
		
//		List<TripDto> sourceAndDestination = tripService.sourceAndDestination("nanded", "pune");
//		System.out.println(sourceAndDestination);
//		List<TripDto> tripNoBetween = tripService.tripNoBetween(3, 5);
//		System.out.println(tripNoBetween);
		 
		 TripRepository tripRepository=context.getBean(TripRepository.class);
//		 tripRepository.findByPlannedDateAfter(LocalDate.of(2022,10, 20)).forEach(System.out::println);
//		 tripRepository.findByPlannedDateBefore(LocalDate.of(2022,10, 20)).forEach(System.out::println);
//		
//		 System.out.println("trip count greater than 10 : "+ tripRepository.countByDaysGreaterThan(10));
		 
//		 tripRepository.findBySourceIn(Arrays.asList(new String[]{"nanded","pune"})).forEach(System.out::println);
//		 tripRepository.findByTripNameLike("%a%").forEach(System.out::println);
//		 tripRepository.findBySourceOrderByDays("latur").forEach(System.out::println);
		 
	//	 ParcelRepository parcel=context.getBean(ParcelRepository.class);
		 
	//	 DeliveryAssociateRepository deliveryAssociateRepository=context.getBean(DeliveryAssociateRepository.class);
		 
	/*	 int updaTripSOurceAndDestinationByTripNo = tripRepository.updaTripSOurceAndDestinationByTripNo(2, "Traoda", "RajPoint");
		 System.out.println("Updated Row :"+updaTripSOurceAndDestinationByTripNo);
		 */
//		 int updateSourceAndDestinationByNo = tripService.updateSourceAndDestinationByNo(2, "Taroda", "RajPoint");
//		 System.out.println("Updated Rows : "+updateSourceAndDestinationByNo);
		 
		/* tripRepository.findByDays(10).forEach(e->{
			 System.out.println(e.getSource() +" : " +e.getDestination()+" : "+e.getDays() );
		 });*/
		 
	/*	 tripRepository.findByDaysBetween(9, 12).forEach(e->{
			 System.out.println(e.getVacationname()+" : "+e.getHolidaySource()+" : "+e.getHolidayDestination()+" : "+e.getHolidayDays());
		 });
		 
		 
		 tripRepository.findByDaysBetweenOrderByDays(9, 12).forEach(e->{
			 System.out.println(e.getVacationname()+" : "+e.getHolidaySource()+" : "+e.getHolidayDestination()+" : "+e.getHolidayDays());
		 });
		 */
	/*	 
		 tripRepository.findByPlannedDateBetween(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 31)).forEach(e->{
		//	System.out.println("Class:"+e.getClass());
			 System.out.println(e.getSource()+":"+e.getDestination()+":"+e.getDays()+":"+e.getPlannedDate());
		 });
		 */
		 
	/*	 tripRepository.findByTripNameLike("%a%", BasicTrip.class).forEach(e->{
			 System.out.println(e.getSource()+":"+e.getDestination()); 
		 });
		 */
		 
/*		 tripRepository.findByTripNameLike("%a%", DetailsTrip.class).forEach(e->{
			 System.out.println(e.getSource()+":"+e.getDestination()+":"+e.getDays()+":"+e.getTripName()+":"+e.getEstimatedCost()); 
		 });
		 */
	}
}
