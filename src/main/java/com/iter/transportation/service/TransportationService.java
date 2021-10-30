package com.iter.transportation.service;

import com.amadeus.exceptions.ResponseException;
import com.iter.transportation.amadeus.client.FlightTicketRequest;
import com.iter.transportation.dto.FlightOfferSearchDto;
import com.iter.transportation.dto.LocationDto;

public interface TransportationService {

	LocationDto[] getCitiesInfo(String city) throws ResponseException;
	FlightOfferSearchDto[] getFlightTickets(FlightTicketRequest parameterObject) throws ResponseException;
}
