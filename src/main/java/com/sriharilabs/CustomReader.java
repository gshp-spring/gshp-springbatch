package com.sriharilabs;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class CustomReader implements ItemReader<MemeberShip> {

	
	private String[] messages = { "javainuse.com",
			"sriharilabs",
			"harisri" };

	private static int count = 0;

	@Override
	public MemeberShip read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {

		System.out.println("THIS IS MY COUNT::: "+count);
		if (count < messages.length) {
			
			MemeberShip m=new MemeberShip();
			m.setFirstName("vamsi"+messages[count++]);
			m.setLastName("PRasad");
			
			System.out.println("Returned...");
			return m;
		} else {
			count = 0;
		}
		return null;
	}
	

}
