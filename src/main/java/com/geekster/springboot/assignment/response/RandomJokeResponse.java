package com.geekster.springboot.assignment.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RandomJokeResponse {

	private String type;
	private String setup;
	private String punchline;
	private Integer id;
	
	public RandomJokeResponse(String type, String setup, String punchline, Integer id) {
		super();
		this.type = type;
		this.setup = setup;
		this.punchline = punchline;
		this.id = id;
	}

}
