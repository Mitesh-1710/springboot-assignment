package com.geekster.springboot.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.geekster.springboot.assignment.constants.ApiPath;
import com.geekster.springboot.assignment.constants.ExternalApiUrl;
import com.geekster.springboot.assignment.response.ChucknorrisRandomJokeResponse;
import com.geekster.springboot.assignment.service.ChucknorrisRandomJokeService;

@RestController
@RequestMapping(ApiPath.CHUCKNORRIS_RANDOM_JOKES_API)
public class ChucknorrisRandomJokeController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ChucknorrisRandomJokeService chucknorrisRandomJokeService;

	@GetMapping
	public ChucknorrisRandomJokeResponse getChucknorrisRandomJoke() {

		String url = ExternalApiUrl.CHUCKNORRIS_RANDOM_JOKES_URL;
		String apiResponse = restTemplate.getForEntity(url, String.class).getBody();
		return chucknorrisRandomJokeService.getChucknorrisRandomJoke(apiResponse);

	}

}
