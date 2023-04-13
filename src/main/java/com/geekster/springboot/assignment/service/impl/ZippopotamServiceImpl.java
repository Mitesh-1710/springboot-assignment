package com.geekster.springboot.assignment.service.impl;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.model.Places;
import com.geekster.springboot.assignment.response.ZippopotamResponse;
import com.geekster.springboot.assignment.service.ZippopotamService;

@Service
public class ZippopotamServiceImpl implements ZippopotamService {

	public ZippopotamResponse getZippopotam(String apiResponse) {

		JSONObject zippopotam = new JSONObject(apiResponse);
		JSONArray placesArray = (JSONArray) zippopotam.get("places");
		JSONObject places = new JSONObject(placesArray.get(0).toString());

		return new ZippopotamResponse(zippopotam.getString("post code"), zippopotam.getString("country"),
				zippopotam.getString("country abbreviation"),
				new Places(places.getString("place name"), places.getString("longitude"), places.getString("state"),
						places.getString("state abbreviation"), places.getString("latitude")));

	}

}
