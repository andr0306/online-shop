package com.diplom.domain.mail;

import lombok.Data;

@Data
public class Mail {

	private String from;
	private String to;
	private String subject;
	private String content;

	public Mail() {
		this.from = "your@gmail.com";
		
	}
	
}
