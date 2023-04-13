package com.geekster.springboot.assignment.service.impl;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.response.RandomJokeResponse;
import com.geekster.springboot.assignment.service.RandomJokeService;

@Service
public class RandomJokeServiceImpl implements RandomJokeService {

	public RandomJokeResponse getRandomJoke(String apiResponse) {

		JSONObject joke = new JSONObject(apiResponse);

		return new RandomJokeResponse(joke.getString("type"), joke.getString("setup"), joke.getString("punchline"),
				(Integer) joke.get("id"));

	}

}
