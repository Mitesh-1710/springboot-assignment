package com.geekster.springboot.assignment.service;

import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.response.RandomJokeResponse;

@Service
public interface RandomJokeService {

	public RandomJokeResponse getRandomJoke(String apiResponse);

}
