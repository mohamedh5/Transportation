package com.iter.transportation.dto;

import lombok.Data;

@Data
public class SearchPriceDto {

	private String currency;
	private double total;
	private double base;
	private FeeDto[] fees;
	private double grandTotal;

	@Data
	public static class FeeDto {
		private double amount;
		private String type;
	}
}
