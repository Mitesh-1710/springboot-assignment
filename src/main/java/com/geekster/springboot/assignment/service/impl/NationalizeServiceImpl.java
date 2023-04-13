package com.geekster.springboot.assignment.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.model.Country;
import com.geekster.springboot.assignment.response.NationalizeResponse;
import com.geekster.springboot.assignment.service.NationalizeService;

@Service
public class NationalizeServiceImpl implements NationalizeService {

	public NationalizeResponse getNationalize(String apiResponse) {

		JSONObject nationalize = new JSONObject(apiResponse);
		JSONArray countryArray = (JSONArray) nationalize.get("country");

		List<Object> countryArrayList = countryArray.toList();
		List<Country> countryList = new ArrayList<>();

		countryArrayList.stream().forEach(object -> {
			JSONObject country = new JSONObject(object.toString().replace("=", ":"));
			countryList.add(new Country(country.getString("country_id"), (BigDecimal) country.get("probability")));
		});

		return new NationalizeResponse(countryList, nationalize.getString("name"));

	}

}
