package com.geekster.springboot.assignment.service;

import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.response.ZippopotamResponse;

@Service
public interface ZippopotamService {

	public ZippopotamResponse getZippopotam(String apiResponse);

}
