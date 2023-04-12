package com.geekster.springboot.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.geekster.springboot.assignment.response.RandomJokeResponse;
import com.geekster.springboot.assignment.service.RandomJokeService;

@RestController
@RequestMapping("api/v1/random-joke")
public class RandomUserController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private RandomJokeService randomJokeService;

	@GetMapping
	public RandomJokeResponse getRandomJoke() {

		String url = "https://official-joke-api.appspot.com/random_joke";
		String apiResponse = restTemplate.getForEntity(url, String.class).getBody();
		return randomJokeService.getRandomJoke(apiResponse);

	}

}
