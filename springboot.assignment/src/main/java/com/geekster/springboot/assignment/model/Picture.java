package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Picture {
	
	private String large;
	private String medium;
	private String thumbnail;
	
	public Picture(String large, String medium, String thumbnail) {
		super();
		this.large = large;
		this.medium = medium;
		this.thumbnail = thumbnail;
	}
	
}
