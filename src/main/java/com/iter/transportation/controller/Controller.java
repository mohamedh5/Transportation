package com.iter.transportation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amadeus.exceptions.ResponseException;
import com.iter.transportation.amadeus.client.FlightTicketRequest;
import com.iter.transportation.dto.FlightOfferSearchDto;
import com.iter.transportation.dto.LocationDto;
import com.iter.transportation.service.TransportationService;

@RestController
@RequestMapping("transportation")
public class Controller {

	private TransportationService amadues;

	public Controller(TransportationService amadues) {
		super();
		this.amadues = amadues;
	}

	@GetMapping("city")
	public LocationDto[] getCitiesInfo(String city) throws ResponseException {
		return amadues.getCitiesInfo(city);
	}
	
	@GetMapping("tickets")
	public FlightOfferSearchDto[] getFlightTickets(FlightTicketRequest parameterObject) throws ResponseException {
		return amadues.getFlightTickets(parameterObject);
	}
}
