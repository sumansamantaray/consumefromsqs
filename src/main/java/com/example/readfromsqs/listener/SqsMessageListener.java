/**
 * 
 */
package com.example.readfromsqs.listener;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author SUMAN
 *
 */
@Component
@EnableJms
public class SqsMessageListener {

	@JmsListener(destination="east-sumantestsqs-1")
	public void readMessage(String sqsMessage) {
		System.out.println("Message Received ############## "+sqsMessage);
	}
}
