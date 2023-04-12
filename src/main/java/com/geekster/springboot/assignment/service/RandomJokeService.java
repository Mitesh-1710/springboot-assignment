package com.geekster.springboot.assignment.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.response.RandomJokeResponse;

@Service
public class RandomJokeService {

	public RandomJokeResponse getRandomJoke(String apiResponse) {

		JSONObject joke = new JSONObject(apiResponse);

		return new RandomJokeResponse(joke.getString("type"), joke.getString("setup"), joke.getString("punchline"),
				(Integer) joke.get("id"));

	}

}
