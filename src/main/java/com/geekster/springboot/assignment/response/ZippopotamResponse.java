package com.geekster.springboot.assignment.response;

import com.geekster.springboot.assignment.model.Places;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ZippopotamResponse {

	private String postCode;
	private String country;
	private String countryAbbreviation;
	private Places places;
	
	public ZippopotamResponse(String postCode, String country, String countryAbbreviation, Places places) {
		super();
		this.postCode = postCode;
		this.country = country;
		this.countryAbbreviation = countryAbbreviation;
		this.places = places;
	}

}
