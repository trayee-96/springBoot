package com.cts.springcloud.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vendor {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long vendorId;
	public String vendorName;
	public long deliveryCharge;
	public double rating; 
	
}
