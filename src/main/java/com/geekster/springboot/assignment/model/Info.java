package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Info {
	
	private String seed;
	private Integer results;
	private Integer page;
	private String version;
	
	public Info(String seed, Integer results, Integer page, String version) {
		super();
		this.seed = seed;
		this.results = results;
		this.page = page;
		this.version = version;
	}
	
}
