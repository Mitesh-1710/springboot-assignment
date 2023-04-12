package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Places {

	private String placeName;
	private String longitude;
	private String state;
	private String stateAbbreviation;
	private String latitude;

	public Places(String placeName, String longitude, String state, String stateAbbreviation, String latitude) {
		super();
		this.placeName = placeName;
		this.longitude = longitude;
		this.state = state;
		this.stateAbbreviation = stateAbbreviation;
		this.latitude = latitude;
	}

}
