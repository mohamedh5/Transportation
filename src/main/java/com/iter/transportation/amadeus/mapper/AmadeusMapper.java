package com.iter.transportation.amadeus.mapper;

import org.mapstruct.Mapper;

import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.Location;
import com.iter.transportation.dto.FlightOfferSearchDto;
import com.iter.transportation.dto.LocationDto;

@Mapper(componentModel = "spring")
public interface AmadeusMapper {

	LocationDto[] mapLocations(Location[] locations);
	FlightOfferSearchDto[] mapFlightOfferSearch(FlightOfferSearch[] offers);
}
