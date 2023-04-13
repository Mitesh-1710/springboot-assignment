package com.geekster.springboot.assignment.service;

import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.response.RandomUserResponse;

@Service
public interface RandomUserService {

	public RandomUserResponse getRandomUser(String apiResponse);

}
