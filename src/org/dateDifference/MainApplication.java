package org.dateDifference;

public class MainApplication {

public static void main(String args[]){
	
	String date1 = "11-45-1919";
	String date2 = "11-29-1989";
	
	DateFormat dt1 = null;
	DateFormat dt2 = null;
	try {
		dt1 = new DateFormat(date1);
		dt2 = new DateFormat(date2);
	}
	catch (Exception e) {
		e.printStackTrace();
	}			
	
	System.out.println(DateFormat.findDays(dt1, dt2));

}

}
