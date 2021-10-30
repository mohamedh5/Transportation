package com.iter.transportation.dto;

import lombok.Data;

@Data
public class TravelerPricingDto {

	private String travelerId;
	private String fareOption;
	private String travelerType;
	private SearchPriceDto price;
	private FareDetailsBySegmentDto[] fareDetailsBySegment;

	@Data
	public static class FareDetailsBySegmentDto {
		private String segmentId;
		private String cabin;
		private String fareBasis;
		private String segmentClass;
		private IncludedCheckedBagsDto includedCheckedBags;

	}

	@Data
	public static class IncludedCheckedBagsDto {
		private int weight;
		private String weightUnit;
	}
}
