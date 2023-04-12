package com.geekster.springboot.assignment.service;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.model.Coordinates;
import com.geekster.springboot.assignment.model.DOB;
import com.geekster.springboot.assignment.model.FullName;
import com.geekster.springboot.assignment.model.Id;
import com.geekster.springboot.assignment.model.Info;
import com.geekster.springboot.assignment.model.Location;
import com.geekster.springboot.assignment.model.Login;
import com.geekster.springboot.assignment.model.Picture;
import com.geekster.springboot.assignment.model.Registered;
import com.geekster.springboot.assignment.model.Results;
import com.geekster.springboot.assignment.model.Street;
import com.geekster.springboot.assignment.model.Timezone;
import com.geekster.springboot.assignment.response.RandomUserResponse;

@Service
public class RandomUserService {

	public RandomUserResponse getRandomUser(String apiResponse) {

		Results results = new Results();
		Info info = new Info();

		JSONObject json = new JSONObject(apiResponse);
		JSONArray jsonArray = (JSONArray) json.get("results");
		JSONObject infoKey = (JSONObject) json.get("info");
		JSONObject resultsKey = new JSONObject(jsonArray.get(0).toString());
		JSONObject name = (JSONObject) resultsKey.get("name");
		JSONObject login = (JSONObject) resultsKey.get("login");
		JSONObject dob = (JSONObject) resultsKey.get("dob");
		JSONObject registered = (JSONObject) resultsKey.get("registered");
		JSONObject id = (JSONObject) resultsKey.get("id");
		JSONObject picture = (JSONObject) resultsKey.get("picture");
		JSONObject location = (JSONObject) resultsKey.get("location");
		JSONObject street = (JSONObject) location.get("street");
		JSONObject coordinates = (JSONObject) location.get("coordinates");
		JSONObject timezone = (JSONObject) location.get("timezone");

		results.setGender(resultsKey.getString("gender"));
		results.setNat(resultsKey.getString("nat"));
		results.setPhone(resultsKey.getString("phone"));
		results.setCell(resultsKey.getString("cell"));
		results.setEmail(resultsKey.getString("email"));
		results.setName(new FullName(name.getString("title"), name.getString("first"), name.getString("last")));
		results.setLogin(new Login(login.getString("uuid"), login.getString("username"), login.getString("password"),
				login.getString("salt"), login.getString("md5"), login.getString("sha1"), login.getString("sha256")));
		results.setDob(new DOB(dob.getString("date"), (Integer) dob.get("age")));
		results.setRegistered(new Registered(registered.getString("date"), (Integer) registered.get("age")));
		results.setId(new Id(id.getString("name"), id.getString("value")));
		results.setPicture(
				new Picture(picture.getString("large"), picture.getString("medium"), picture.getString("thumbnail")));
		results.setLocation(new Location(new Street((Integer) street.get("number"), street.getString("name")),
				location.getString("city"), location.getString("state"), location.getString("country"),
				(Integer) location.get("postcode"),
				new Coordinates(coordinates.getString("latitude"), coordinates.getString("longitude")),
				new Timezone(timezone.getString("offset"), timezone.getString("description"))));

		info.setSeed(infoKey.getString("seed"));
		info.setResults((Integer) infoKey.get("results"));
		info.setPage((Integer) infoKey.get("page"));
		info.setVersion(infoKey.getString("version"));

		return new RandomUserResponse(results, info);

	}

}
