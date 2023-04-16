package com.geekster.springboot.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.springboot.assignment.constants.ApiPath;
import com.geekster.springboot.assignment.constants.ApiResponse;
import com.geekster.springboot.assignment.model.Email;
import com.geekster.springboot.assignment.service.EmailSenderService;

@RestController
@RequestMapping(ApiPath.EMAIL_SENDER_API)
public class EmailSenderController {

	@Autowired
	private EmailSenderService emailSenderService;

	@PostMapping
	public String sendEmail(@RequestBody Email email) {

		emailSenderService.sendEmail(email);

		return ApiResponse.EMAIL_SENDER_API_RESPONSE;

	}

}
