package com.geekster.springboot.assignment.service;

import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.response.ChucknorrisRandomJokeResponse;

@Service
public interface ChucknorrisRandomJokeService {

	public ChucknorrisRandomJokeResponse getChucknorrisRandomJoke(String apiResponse);
}
