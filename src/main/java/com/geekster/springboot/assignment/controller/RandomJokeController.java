package com.geekster.springboot.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.geekster.springboot.assignment.response.RandomUserResponse;
import com.geekster.springboot.assignment.service.RandomUserService;

@RestController
@RequestMapping("api/v1/random-user")
public class RandomJokeController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private RandomUserService randomUserService;

	@GetMapping
	public RandomUserResponse getRandomUser() {

		String url = "https://randomuser.me/api/";
		String apiResponse = restTemplate.getForEntity(url, String.class).getBody();
		return randomUserService.getRandomUser(apiResponse);

	}

}
