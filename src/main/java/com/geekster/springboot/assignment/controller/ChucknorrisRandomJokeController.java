package com.geekster.springboot.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.geekster.springboot.assignment.response.ChucknorrisRandomJokeResponse;
import com.geekster.springboot.assignment.service.ChucknorrisRandomJokeService;

@RestController
@RequestMapping("api/v1/chucknorris-random-joke")
public class ChucknorrisRandomJokeController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ChucknorrisRandomJokeService chucknorrisRandomJokeService;

	@GetMapping
	public ChucknorrisRandomJokeResponse getChucknorrisRandomJoke() {

		String url = "https://api.chucknorris.io/jokes/random";
		String apiResponse = restTemplate.getForEntity(url, String.class).getBody();
		return chucknorrisRandomJokeService.getChucknorrisRandomJoke(apiResponse);

	}

}
