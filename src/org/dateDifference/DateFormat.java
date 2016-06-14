package org.dateDifference;

import java.text.ParseException;

public class DateFormat implements Comparable {
	
	static final int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	private int month;
	private int date;
	private int year;
	
	DateFormat(String date) throws ParseException{
	
		if(date==null){
			throw new NullPointerException("date can't be null");
		}
		String[] dateArray = date.split("-");
		if(dateArray.length==1 || dateArray.length == 0){
			throw new IllegalArgumentException("illegal date format");
		}
		
		this.month = Integer.parseInt(dateArray[0]);
		this.date = Integer.parseInt(dateArray[1]);
		this.year = Integer.parseInt(dateArray[2]);
		
		if(this.year < 1900 || this.year > 9999){
			throw  new IllegalArgumentException("illegal year format");
		}
		if(this.date < 0 || this.date>31){
			throw  new IllegalArgumentException("illegal day format");
		}
		if(this.month < 0 || this.month>12){
			throw  new IllegalArgumentException("illegal month format");	
		}
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	public int getYear() {
		return year;
	}
	

	 public static int findDays(DateFormat date1, DateFormat date2){
		 
		 return (Math.abs(totalDaysToDate(date2) - totalDaysToDate(date1)));
		 
	 }
	 
	 public static int totalDaysToDate(DateFormat date){
		 
		 //add total number of years and the date 
		 int totalDays = date.getYear()*365 + date.getDate();
		 
		 //add all days in the month 
		 for(int i=0; i<date.getMonth() - 1; i++){
			 totalDays = totalDays + monthDays[i];
		 }
		 
		 //add total number of leapYears
		 totalDays = totalDays + countLeapYears(date);
		 
		 return totalDays;
	 }
	 
	 /**
	 * @param date: date 
	 * @return total number of leap years till that date
	 */
	public static int countLeapYears(DateFormat date){
		 
		 int count = 0;
		 if(date.getMonth() <= 2 ){
			 count --;
		 }
		 count = date.getYear() / 4 - date.getYear() / 100 + date.getYear() / 400 ;
 
		 return count;
	 }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
