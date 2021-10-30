package com.iter.transportation.amadeus.service;

import org.springframework.stereotype.Service;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.Location;
import com.iter.transportation.amadeus.client.AmadeusHttpClient;
import com.iter.transportation.amadeus.client.FlightTicketRequest;
import com.iter.transportation.amadeus.mapper.AmadeusMapper;
import com.iter.transportation.dto.FlightOfferSearchDto;
import com.iter.transportation.dto.LocationDto;
import com.iter.transportation.service.TransportationService;

@Service
public class AmadeusService implements TransportationService {

	private AmadeusHttpClient client;
	private AmadeusMapper mapper;

	public AmadeusService(AmadeusHttpClient client, AmadeusMapper mapper) {
		super();
		this.client = client;
		this.mapper = mapper;
	}


	@Override
	public LocationDto[] getCitiesInfo(String city) throws ResponseException {
		Location[] locations = client.getCitiesInfo(city);
		return mapper.mapLocations(locations);
	}


	@Override
	public FlightOfferSearchDto[] getFlightTickets(FlightTicketRequest parameterObject) throws ResponseException {
		FlightOfferSearch[] tickets = client.getFlightTickets(parameterObject);
		return mapper.mapFlightOfferSearch(tickets);
	}

}
