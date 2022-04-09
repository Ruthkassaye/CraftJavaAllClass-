package com.day5.switchcase;

import java.util.Scanner;

public class SwitchDemo2withScanner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner print = new Scanner (System.in);
		
		System.out.println ("Please enter your countryName: ");
		String continentName= print.next();
		
	    
	switch (continentName) {
	
	case "Ethiopia": // if the answer is Ethiopia printout Afica 
		continentName = "Africa";
		break;

	case "Germany":  // if the answer is Germany printout Europe
		continentName = "Europe" ;
		break;
		
	case "China": // if the answer is China printout Asia
		continentName = "Asia";
		break;
	
	case "Brazil":  // if the answer is Brazil printout Latin America
		continentName = "Latin America";
		break;
		
	default: 
		continentName = "Invalid";
		break;
		}	
	

        System.out.println(continentName);
		
	}

}
