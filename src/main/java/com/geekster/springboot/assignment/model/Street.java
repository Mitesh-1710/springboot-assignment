package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Street {
	
	private Integer number;
	private String name;
	
	public Street(Integer number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
}
