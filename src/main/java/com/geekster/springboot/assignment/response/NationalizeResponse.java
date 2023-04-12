package com.geekster.springboot.assignment.response;

import java.util.List;

import com.geekster.springboot.assignment.model.Country;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NationalizeResponse {

	private List<Country> country;
	private String name;

	public NationalizeResponse(List<Country> country, String name) {
		super();
		this.country = country;
		this.name = name;
	}

}
