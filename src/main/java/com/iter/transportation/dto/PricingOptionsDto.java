package com.iter.transportation.dto;

import lombok.Data;

@Data
public class PricingOptionsDto {
	private boolean includedCheckedBagsOnly;
	private String[] fareType;
	private String[] corporateCodes;
	private boolean refundableFare;
	private boolean noRestrictionFare;
	private boolean noPenaltyFare;
}
