/**
 * 
 */
package com.friends.components;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author AnudeepKumar
 *
 */
@Component
public class MainScheduler {

	/*@Scheduled(fixedRate = 3000)
	public void sendMorningCoffeeEmail() {
		URL url = null;
		HttpURLConnection httpConnection = null;
		BufferedReader br = null;
		try {
			url = new URL("http://localhost:9090/sendemail");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			httpConnection = (HttpURLConnection) url.openConnection();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			httpConnection.setRequestMethod("GET");
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		httpConnection.setRequestProperty("Accept", "application/json");
		try {
			if (httpConnection.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + httpConnection.getResponseCode());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br = new BufferedReader(new InputStreamReader((httpConnection.getInputStream())));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String output;
		System.out.println("Output from Server .... \n");
		try {
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		httpConnection.disconnect();
	}*/

}
