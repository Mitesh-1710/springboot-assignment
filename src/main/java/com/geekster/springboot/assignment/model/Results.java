package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Results {

	private String gender;
	private FullName name;
	private Location location;
	private String email;
	private Login login;
	private DOB dob;
	private Registered registered;
	private String phone;
	private String cell;
	private Id id;
	private Picture picture;
	private String nat;

}
