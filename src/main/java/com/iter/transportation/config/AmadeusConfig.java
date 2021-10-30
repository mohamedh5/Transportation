package com.iter.transportation.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties("amadeus")
@Data
public class AmadeusConfig {

	private String apiKey;
	private String apiSecret;
}
