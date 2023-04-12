package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Timezone {
	
	private String offset;
	private String description;
	
	public Timezone(String offset, String description) {
		super();
		this.offset = offset;
		this.description = description;
	}
	
}
