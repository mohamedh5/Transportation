package com.iter.transportation.dto;

import lombok.Data;

@Data
public class LocationDto {

	private String type;
	private String name;
	private String detailedName;
	private String iataCode;
	private GeoCodeDto geoCode;
	private AddressDto address;
}
