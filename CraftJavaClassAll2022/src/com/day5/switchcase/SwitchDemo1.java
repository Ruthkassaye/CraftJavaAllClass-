package com.day5.switchcase;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day =3;
		String dayName;
		
		switch (day) {
		case 1:
			dayName = "Today is Monday";
			break;
		case 2: 
			dayName =" Today is Tuesday";
			break;
		case 3: 
			dayName = "Today is Wednesday";
			break;
		case 4:
			dayName = "Today is Thursday";
			break;
		case 5:
			dayName = "Today is Friday";
		case 6:
			dayName = "Today is Saturday";
		case 7:
			dayName = "Today is Sunday";
			
        default: 
            dayName = "Invalid day"; 
            break; 
        } 
           System.out.println(dayName); 
           
    } 
}

		
	
