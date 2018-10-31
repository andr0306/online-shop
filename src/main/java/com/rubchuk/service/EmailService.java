package com.rubchuk.service;

import com.rubchuk.domain.mail.Mail;

public interface EmailService {

	void sendMessage(Mail mail);
	
}
