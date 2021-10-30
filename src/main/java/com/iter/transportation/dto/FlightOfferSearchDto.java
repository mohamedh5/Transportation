package com.iter.transportation.dto;

import lombok.Data;

@Data
public class FlightOfferSearchDto {

	private String type;
	private String id;
	private String source;
	private boolean instantTicketingRequired;
	private boolean nonHomogeneous;
	private boolean oneWay;
	private String lastTicketingDate;
	private int numberOfBookableSeats;
	private ItineraryDto[] itineraries;
	private SearchPriceDto price;
	private PricingOptionsDto pricingOptions;
	private String[] validatingAirlineCodes;
	private TravelerPricingDto[] travelerPricings;
	private String choiceProbability;
}
