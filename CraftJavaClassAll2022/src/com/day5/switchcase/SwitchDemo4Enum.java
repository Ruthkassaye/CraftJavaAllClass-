package com.day5.switchcase;

public class SwitchDemo4Enum {

	public enum vowel {a,e,i,o,u,}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vowel [] characters = vowel.values (); // this is called types of array 
		
		for (vowel now: characters) {  // for each statement 
			
			
			switch(now){
				
			case a: 
				System.out.println ("it is a vowel letter");
				break;
				
			case e: 	
				System.out.println ("it is a vowel letter");
				break;
				
			case i:
				System.out.println ("it is a vowel letter");
				break;
				
			case o:
				System.out.println ("it is a vowel letter");
				break;
				
			case u: 
				System.out.println ("it is a vowel letter");
				break;
			default: 
				System.out.println ("it is a consonant letter");
			}
			
		}
		
		
	}

}
