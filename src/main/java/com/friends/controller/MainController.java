/**
 * 
 */
package com.friends.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.friends.service.MainService;

/**
 * @author AnudeepKumar
 *
 */
@RestController
public class MainController {

	@Autowired
	@Qualifier("mainService")
	private MainService mainService;

	@RequestMapping(value = "/Ping")
	public String pingMe() {
		return "I am available!!!";
	}

	@RequestMapping(value = "/sendmorningcoffeeemail")
	public String sendMorningCoffeeEmail() {
		try {
			mainService.workOnSendsendMorningCoffeeEmail();
			return "**********Morning Coffee Email Sent Successfully**********";
		} catch (Exception exception) {
			System.out.println(exception);
			return "**********Email Sending Failed********** :: " + exception;
		}

	}
	
	@RequestMapping(value = "/sendeveningcoffeeemail")
	public String sendEveningCoffeeEmail() {
		try {
			mainService.workOnSendsendEveningCoffeeEmail();
			return "**********Evening Coffee Email Sent Successfully**********";
		} catch (Exception exception) {
			System.out.println(exception);
			return "**********Email Sending Failed********** :: " + exception;
		}

	}
	
	
	@RequestMapping(value = "/sendlunchemail")
	public String sendLunchEmail() {
		try {
			mainService.workOnSendingLunchEmail();
			return "**********Lunch Email Sent Successfully**********";
		} catch (Exception exception) {
			System.out.println(exception);
			return "**********Email Sending Failed********** :: " + exception;
		}

	}
	
	
}
