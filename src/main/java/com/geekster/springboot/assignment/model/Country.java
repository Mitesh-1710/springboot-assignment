package com.geekster.springboot.assignment.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Country {

	private String countryId;
	private BigDecimal probability;

	public Country(String countryId, BigDecimal probability) {
		super();
		this.countryId = countryId;
		this.probability = probability;
	}

}
