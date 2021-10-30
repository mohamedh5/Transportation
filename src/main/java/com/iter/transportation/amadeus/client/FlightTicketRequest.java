package com.iter.transportation.amadeus.client;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class FlightTicketRequest {
	private String origin;
	private String destination;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate departureDate;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate returnDate;
	private int adult;
}