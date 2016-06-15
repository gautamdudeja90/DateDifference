package org.dateDifference;


public class MainApplication {

public static void main(String args[]){
	


	
	String date1 = "02-29-2015";
	String date2 = "11-29-1989";
	
	DateFormatParser dt1 = null;
	DateFormatParser dt2 = null;
	try {
		dt1 = new DateFormatParser(date1);
		dt2 = new DateFormatParser(date2);
		System.out.println(DateFormatParser.findDays(dt1, dt2));

	}
	catch (Exception e) {
		System.out.println(e);
	}
	

	


}

}
