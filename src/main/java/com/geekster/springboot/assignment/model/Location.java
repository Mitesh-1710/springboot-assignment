package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Location {
	
	private Street street;
	private String city;
	private String state;
	private String country;
	private Integer postcode;
	private Coordinates coordinates;
	private Timezone timezone;
	
	public Location(Street street, String city, String state, String country, Integer postcode, Coordinates coordinates,
			Timezone timezone) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postcode = postcode;
		this.coordinates = coordinates;
		this.timezone = timezone;
	}

}
