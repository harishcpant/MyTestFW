package com.api;

import java.time.LocalDateTime;

public class testcode {

	public static void main(String[] args) {
		System.out.println("heeloo1");
		System.out.println(LocalDateTime.now().getYear()); 
		System.out.println(LocalDateTime.now().getMonthValue()); 
		System.out.println(LocalDateTime.now().getDayOfMonth());    
		System.out.println(LocalDateTime.now().getHour());      
	    System.out.println(LocalDateTime.now().getMinute());     
	    System.out.println(LocalDateTime.now().getSecond());
	    
	    String currentDateTime=LocalDateTime.now().getDayOfMonth() 
	    			+ "-"
	    			+ LocalDateTime.now().getDayOfMonth() 
	    			+ "-"
	    			+ LocalDateTime.now().getMonthValue() 
	    			+ "-"
	    			+ LocalDateTime.now().getYear() 
	    			+ "-"
	    			+ LocalDateTime.now().getHour() 
	    			+ "-"
	    			+ LocalDateTime.now().getMinute() 
	    			+ "-"
	    			+ LocalDateTime.now().getSecond();
	    			
	    System.out.println(currentDateTime);
	}

}
