package com.geekster.springboot.assignment.service;

import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.response.NationalizeResponse;

@Service
public interface NationalizeService {

	public NationalizeResponse getNationalize(String apiResponse);

}
