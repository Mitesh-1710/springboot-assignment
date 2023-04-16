package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Email {

	private String recipientMail;
	private String subject;
	private String body;

	public Email(String recipientMail, String subject, String body) {
		super();
		this.recipientMail = recipientMail;
		this.subject = subject;
		this.body = body;
	}

}
