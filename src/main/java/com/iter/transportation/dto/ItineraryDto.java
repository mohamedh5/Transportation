package com.iter.transportation.dto;

import lombok.Data;

@Data
public class ItineraryDto {

	private String duration;
	private SearchSegmentDto[] segments;

	@Data
	public static class SearchSegmentDto {
		private AirportInfoDto departure;
		private AirportInfoDto arrival;
		private String carrierCode;
		private String number;
		private AircraftDto aircraft;
		private String duration;
		private String id;
		private int numberOfStops;
		private boolean blacklistedInEU;
		private Co2EmissionsDto[] co2Emissions;
	}

	@Data
	public static class Co2EmissionsDto {
		private int weight;
		private String weightUnit;
		private String cabin;
	}

	@Data
	public static class AirportInfoDto {
		private String iataCode;
		private String terminal;
		private String at;
	}

	@Data
	public static class AircraftDto {
		private String code;
	}
}
