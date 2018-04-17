/**
 * 
 */
package com.friends.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

/**
 * @author AnudeepKumar
 *
 */
@Service("mainService")
public class MainService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	public void workOnSendsendMorningCoffeeEmail() {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = null;
		try {
			mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		} catch (MessagingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String[] toEmial = { "donthu04@gmail.com", "akurathi15@gmail.com" };
		try {
			mimeMessageHelper.setTo(toEmial);
			mimeMessageHelper.setText(
					"Hello All \n\nGood Morning!!!\n\nIt's Time to Morning Coffee Break, Please start Now. \n \n \nThanks & Regards,"
							+ "\nAnudeep Kumar Donthu");
			ClassPathResource classPathResource = new ClassPathResource("coffee1.jpg");
			mimeMessageHelper.addAttachment("coffee1.jpg", classPathResource);
			mimeMessageHelper.setSubject("Welcome Email to Morning Coffee");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		javaMailSender.send(mimeMessage);

	}
	
	
	public void workOnSendsendEveningCoffeeEmail() {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = null;
		try {
			mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		} catch (MessagingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String[] toEmial = { "donthu04@gmail.com", "akurathi15@gmail.com" };
		try {
			mimeMessageHelper.setTo(toEmial);
			mimeMessageHelper.setText(
					"Hello All \n\nGood Evening!!!\n\nIt's Time to Evening Coffee Break, Please start Now. \n \n \nThanks & Regards,"
							+ "\nAnudeep Kumar Donthu");
			ClassPathResource classPathResource = new ClassPathResource("coffee2.jpg");
			mimeMessageHelper.addAttachment("coffee2.jpg", classPathResource);
			mimeMessageHelper.setSubject("Welcome Email to Evening Coffee");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		javaMailSender.send(mimeMessage);

	}
	
	public void workOnSendingLunchEmail() {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = null;
		try {
			mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		} catch (MessagingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String[] toEmial = { "donthu04@gmail.com", "akurathi15@gmail.com" };
		try {
			mimeMessageHelper.setTo(toEmial);
			mimeMessageHelper.setText(
					"Hello All \n\nGood Afternoon!!!\n\nIt's Time to Lunch, Please start Now. \n \n \nThanks & Regards,"
							+ "\nAnudeep Kumar Donthu");
			ClassPathResource classPathResource = new ClassPathResource("lunch.jpg");
			mimeMessageHelper.addAttachment("lunch.jpg", classPathResource);
			mimeMessageHelper.setSubject("Welcome Email to Lunch");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		javaMailSender.send(mimeMessage);

	}

}
