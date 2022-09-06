package com.tourplanner.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Entity
@Table(name="parcel")
@Data
public class Parcel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="parcel_no")
	private int parcelNo;
	private String description;
	private String wieght;
	@Column(name="shipping_charges")
	private String shippingCharges;
	
	@ManyToOne
	@JoinColumn(name="dilvery_associate_no")
	private DeliveryAssociate deliveryAssociate;
	
}
