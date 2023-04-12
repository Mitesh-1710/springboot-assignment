package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Registered {
	
	private String date;
	private Integer age;
	
	public Registered(String date, Integer age) {
		super();
		this.date = date;
		this.age = age;
	}
	
}
