package com.geekster.springboot.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.geekster.springboot.assignment.response.NationalizeResponse;
import com.geekster.springboot.assignment.service.NationalizeService;

@RestController
@RequestMapping("api/v1/nationalize")
public class NationalizeController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private NationalizeService nationalizeService;

	@GetMapping
	public NationalizeResponse getNationalize() {

		String url = "https://api.nationalize.io/?name=nathaniel";
		String apiResponse = restTemplate.getForEntity(url, String.class).getBody();
		return nationalizeService.getNationalize(apiResponse);

	}

}
