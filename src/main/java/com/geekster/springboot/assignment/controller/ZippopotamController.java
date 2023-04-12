package com.geekster.springboot.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.geekster.springboot.assignment.response.ZippopotamResponse;
import com.geekster.springboot.assignment.service.ZippopotamService;

@RestController
@RequestMapping("api/v1/zippopotam")
public class ZippopotamController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ZippopotamService zippopotamService;

	@GetMapping
	public ZippopotamResponse getZippopotam() {

		String url = "https://api.zippopotam.us/us/33162";
		String apiResponse = restTemplate.getForEntity(url, String.class).getBody();
		return zippopotamService.getZippopotam(apiResponse);

	}

}
