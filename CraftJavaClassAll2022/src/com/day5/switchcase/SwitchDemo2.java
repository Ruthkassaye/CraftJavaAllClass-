package com.day5.switchcase;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String country = "Ethiopia";
		String countryName;
		
		switch (country) { // we are testing country with different case to decide eligibility 
		case "Ethiopia":
			countryName = "Africa";
			break;
		case "Germany": 
			countryName =" Europe";
			break;
		case "China": 
			countryName = "Asia";
			break;
		case "Brazil":
			countryName = "Latin America";
			break;
		
        default: 
        	countryName = "Invalid day"; 
            break; 
        } 
           System.out.println(countryName); 
           
    } 
}

	
