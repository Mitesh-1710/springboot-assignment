package com.geekster.springboot.assignment.response;

import com.geekster.springboot.assignment.model.Info;
import com.geekster.springboot.assignment.model.Results;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RandomUserResponse {

	private Results results;
	private Info info;

	public RandomUserResponse(Results results, Info info) {
		super();
		this.results = results;
		this.info = info;
	}

}
