package com.geekster.springboot.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.geekster.springboot.assignment.constants.ApiPath;
import com.geekster.springboot.assignment.constants.ExternalApiUrl;
import com.geekster.springboot.assignment.response.RandomJokeResponse;
import com.geekster.springboot.assignment.service.RandomJokeService;

@RestController
@RequestMapping(ApiPath.RANDOM_JOKE_API)
public class RandomJokeController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private RandomJokeService randomJokeService;

	@GetMapping
	public RandomJokeResponse getRandomJoke() {

		String url = ExternalApiUrl.RANDOM_JOKE_URL;
		String apiResponse = restTemplate.getForEntity(url, String.class).getBody();
		return randomJokeService.getRandomJoke(apiResponse);

	}

}
