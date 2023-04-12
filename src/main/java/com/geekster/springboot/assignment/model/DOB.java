package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DOB {
	
	private String date;
	private Integer age;
	
	public DOB(String date, Integer age) {
		super();
		this.date = date;
		this.age = age;
	}
	
}
