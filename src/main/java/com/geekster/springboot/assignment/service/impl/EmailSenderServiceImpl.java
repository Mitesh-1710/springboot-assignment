package com.geekster.springboot.assignment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.geekster.springboot.assignment.constants.EmailConstants;
import com.geekster.springboot.assignment.model.Email;
import com.geekster.springboot.assignment.service.EmailSenderService;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {

	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(Email email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(EmailConstants.SENDER_EMAIL);
		message.setTo(email.getRecipientMail());
		message.setText(email.getBody());
		message.setSubject(email.getSubject());
		mailSender.send(message);
	}

}
