package org.dateDifference;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;

public class TestDataFormat {

	@Test
	public void testDataFormat() {
		String date1 = "02-28-2015";
		String date2 = "02-29-2016";
		DateFormatParser dateFormat1=null;
		DateFormatParser dateFormat2=null;
		try {
			dateFormat1 = new DateFormatParser(date1);
			dateFormat2 = new DateFormatParser(date2);
			System.out.println(DateFormatParser.findDays(dateFormat1, dateFormat2));
			assertEquals(366, DateFormatParser.findDays(dateFormat1, dateFormat2));
			
		} catch (ParseException e) {
	
			e.printStackTrace();
		}
	}

}
