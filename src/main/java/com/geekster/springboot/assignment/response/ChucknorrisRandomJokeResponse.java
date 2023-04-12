package com.geekster.springboot.assignment.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChucknorrisRandomJokeResponse {

	private String value;

	public ChucknorrisRandomJokeResponse(String value) {
		super();
		this.value = value;
	}

}
