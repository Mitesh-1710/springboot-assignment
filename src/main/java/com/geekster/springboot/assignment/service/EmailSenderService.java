package com.geekster.springboot.assignment.service;

import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.model.Email;

@Service
public interface EmailSenderService {

	public void sendEmail(Email email);

}
