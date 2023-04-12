package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Id {
	
	private String name;
	private String value;
	
	public Id(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	
}
