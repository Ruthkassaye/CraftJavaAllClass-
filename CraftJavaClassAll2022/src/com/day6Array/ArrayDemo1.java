package com.day6Array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ageofStudent =new int[5]; // data declaration and initializing. the total index is from 0 - 87,i.e. 88-1=87
		
		
		ageofStudent[0] =30; // adding data in the array. ageofStudent is our array name
		ageofStudent[1] =31;
		ageofStudent[2] =32;
		ageofStudent[3] =20;
		ageofStudent[4] =21;
	
//	System.out.println(ageofStudent[0]); // so to print we refer the arrayname followed by the index number 
//	System.out.println(ageofStudent[1]);
	
//		we can also use loop to print all of the arrays instead of listing the arrayname as above. we can use different loop statment  
		
		//lets start with for each statement 
		
//		Syntax: 
//		for (arraytype anyname: arrayName) {
//		system.out.println (ananyanayname); 
		
		
//		for (int element: ageofStudent) { // element could be anyname. it refers to a variable name
//			System.out.print(element);// the print value would be from 30 31 32 20 21  and 0s until i reaches 87 because we have assigned values until index 4; and our index goes until 87. if i don't to see the 0s i can reduce the index number to 5 
//		}
		
		
//		we can also use for loop statement to access the array
		
//		for (arraytype put where index starts; size of the array; i++ )
//		system.out.println (arrayName[i]);
		
		for (int i=0; i<5; i++) {
			System.out.println(ageofStudent [i]);
		
	}
}
}