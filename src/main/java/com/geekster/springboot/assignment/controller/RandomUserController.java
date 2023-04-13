package com.geekster.springboot.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.geekster.springboot.assignment.constants.ApiPath;
import com.geekster.springboot.assignment.constants.ExternalApiUrl;
import com.geekster.springboot.assignment.response.RandomUserResponse;
import com.geekster.springboot.assignment.service.RandomUserService;

@RestController
@RequestMapping(ApiPath.RANDOM_USER_API)
public class RandomUserController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private RandomUserService randomUserService;

	@GetMapping
	public RandomUserResponse getRandomUser() {

		String url = ExternalApiUrl.RANDOM_USER_URL;
		String apiResponse = restTemplate.getForEntity(url, String.class).getBody();
		return randomUserService.getRandomUser(apiResponse);

	}

}
