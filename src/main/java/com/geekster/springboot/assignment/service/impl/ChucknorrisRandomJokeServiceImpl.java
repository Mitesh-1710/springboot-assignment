package com.geekster.springboot.assignment.service.impl;

import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.response.ChucknorrisRandomJokeResponse;
import com.geekster.springboot.assignment.service.ChucknorrisRandomJokeService;

@Service
public class ChucknorrisRandomJokeServiceImpl implements ChucknorrisRandomJokeService{

	public ChucknorrisRandomJokeResponse getChucknorrisRandomJoke(String apiResponse) {

		return new ChucknorrisRandomJokeResponse(apiResponse);

	}

}
