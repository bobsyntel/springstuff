package com.bob.email.config;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
import com.sendgrid.*;

@Component
public class EmailConfig {
	public static void main(String[] args) throws IOException {
//	    Email from = new Email("bobigbarumah@gmail.com");
//	    String subject = "Sending with SendGrid is Fun";
//	    Email to = new Email("jamserver6@gmail.com");
//	    Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
//	    Mail mail = new Mail(from, subject, to, content);
//		Mail mail = emailShit("jamserver6@gmail.com");
//	    SendGrid sg = new SendGrid("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");
//	    Request request = new Request();
//	    try {
//	      request.setMethod(Method.POST);
//	      request.setEndpoint("mail/send");
//	      request.setBody(mail.build());
//	      Response response = sg.api(request);
//	      System.out.println(response.getStatusCode());
//	      System.out.println(response.getBody());
//	      System.out.println(response.getHeaders());
//	    } catch (IOException ex) {
//	      throw ex;
//	    }
//	
	  }
	
	public void emails()throws IOException{
		Mail mail = emailShit("jamcapstone6@gmail.com");
	    SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
	    Request request = new Request();
	    try {
	      request.setMethod(Method.POST);
	      request.setEndpoint("mail/send");
	      request.setBody(mail.build());
	      Response response = sg.api(request);
	      System.out.println(response.getStatusCode());
	      System.out.println(response.getBody());
	      System.out.println(response.getHeaders());
	    } catch (IOException ex) {
	      throw ex;
	    }
		
	}
	public Mail emailShit(String email) {
		Email from = new Email("bobigbarumah@gmail.com");
	    String subject = "Sup Joss you the real MVP";
	    Email to = new Email(email);
	    Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
	    Mail mail = new Mail(from, subject, to, content);
	    return mail;
		
	}
	
//	@Bean
//	public JavaMailSender getJavaMailSender() {
//	    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//	    mailSender.setHost("smtp.gmail.com");
//	    mailSender.setPort(587);
//	     
//	    mailSender.setUsername("my.gmail@gmail.com");
//	    mailSender.setPassword("password");
//	     
//	    Properties props = mailSender.getJavaMailProperties();
//	    props.put("mail.transport.protocol", "smtp");
//	    props.put("mail.smtp.auth", "true");
//	    props.put("mail.smtp.starttls.enable", "true");
//	    props.put("mail.debug", "true");
//	     
//	    return mailSender;
//	}

}
