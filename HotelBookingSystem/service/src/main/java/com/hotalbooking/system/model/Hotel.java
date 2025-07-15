package com.hotalbooking.system.model;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hotel {

	BigInteger hotelId;
	String hotelName;
	String hotelAddress;
	String phoneNumber;
	
}
