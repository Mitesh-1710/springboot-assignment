package com.geekster.springboot.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.geekster.springboot.assignment.constants.ApiPath;
import com.geekster.springboot.assignment.constants.ExternalApiUrl;
import com.geekster.springboot.assignment.response.ZippopotamResponse;
import com.geekster.springboot.assignment.service.ZippopotamService;

@RestController
@RequestMapping(ApiPath.ZIPPOPOTAM_API)
public class ZippopotamController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ZippopotamService zippopotamService;

	@GetMapping
	public ZippopotamResponse getZippopotam() {

		String url = ExternalApiUrl.ZIPPOPOTAM_URL;
		String apiResponse = restTemplate.getForEntity(url, String.class).getBody();
		return zippopotamService.getZippopotam(apiResponse);

	}

}
