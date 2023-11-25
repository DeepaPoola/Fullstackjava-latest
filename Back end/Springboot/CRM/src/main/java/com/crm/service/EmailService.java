package com.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
   
	@Autowired
	JavaMailSender mailSender;
	
	public void sendmailtoUser(String mailid, String name) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(mailid);
		mailMessage.setSubject("Customer Registration from Pro Stack");
		mailMessage.setText("Hello," + name+", Thank you Register! Welcome");
		mailSender.send(mailMessage);
	}
}
