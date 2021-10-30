package com.iter.transportation.amadeus.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.referenceData.Locations;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.Location;
import com.iter.transportation.config.AmadeusConfig;

@Component
public class AmadeusHttpClient {

	private Amadeus amadeus;

	@Autowired
	public AmadeusHttpClient(AmadeusConfig config) {
		super();
		amadeus = Amadeus.builder(config.getApiKey(), config.getApiSecret()).setLogLevel("debug").build();
	}

	public Location[] getCitiesInfo(String city) throws ResponseException {
		return amadeus.referenceData.locations.get(Params.with("keyword", city).and("subType", Locations.CITY));
	}

	public FlightOfferSearch[] getFlightTickets(FlightTicketRequest parameterObject) throws ResponseException {
		Params requestParams = Params.with("originLocationCode", parameterObject.getOrigin())
				.and("destinationLocationCode", parameterObject.getDestination())
				.and("departureDate", parameterObject.getDepartureDate()).and("adults", parameterObject.getAdult())
				.and("max", 5);
		if (parameterObject.getReturnDate() != null) {
			requestParams.and("returnDate", parameterObject.getReturnDate());
		}
		return amadeus.shopping.flightOffersSearch.get(requestParams);
	}

}
