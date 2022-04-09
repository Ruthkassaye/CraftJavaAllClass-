package com.day10Abstract;

public class ExcepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a =10, b = 0;
//		System.out.println(a/b); // this code is okay. the result is an error because any number divided by 0 doesn't exist 

		
// to resolve the above error, I use try and catch method 
		
		try {  // but the method here that creates an error 
			
			String val = null;
			int len = val.length();// this code is okay but in the print out result is an error (it saysNullPointerException) because there is no length in val as val is null 
			
			int [] arr = new int [5];
			arr [5] =10; // this is code is okay but the result would be an error there are only 4 index of an arry values of 5. 
			
			int a =10, b = 0;
			System.out.println(a/b);
			
		}
//			catch (ArithmeticException anyname) {  // put the error that display in the printing out section 
//			System.out.println(anyname.getMessage());
//		}
//		
//		catch (ArrayIndexOutOfBoundsException anyaname2) {
//		}
//	    
//		catch (NullPointerException anyaname2) {
		
//	If I want to catch all of exceptions meaning  I dont need to catch all the errors above one by one 
			
			catch (Exception anayname) {
			}
			
			finally { // to show that the code will continue 
				System.out.println("finally...");
			}
			
			
		
	
}
}
