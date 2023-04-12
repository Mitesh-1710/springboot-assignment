package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FullName {
	
	private String title;
	private String first;
	private String last;
	
	public FullName(String title, String first, String last) {
		super();
		this.title = title;
		this.first = first;
		this.last = last;
	}
	
}
