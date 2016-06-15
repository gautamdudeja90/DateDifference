package org.dateDifference;

import java.text.ParseException;

import org.junit.Test;

public class TestException {

	@Test(expected=IllegalArgumentException.class)
    public void testIndexOutOfBoundsException() {
		String date1 = "02-30-2015";
		DateFormatParser dateFormat1=null;
		try {
			dateFormat1 = new DateFormatParser(date1);
	
			
		} catch (ParseException e) {
	
			e.printStackTrace();
		}
    }

}
