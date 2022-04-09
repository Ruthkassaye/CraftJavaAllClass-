package com.day3Variables;

public class InstanceVariableDemo {
	
	public String countryOrigin = "Ethiopia"; // these are instance variable 
	public String currentCountry = "USA";
	
    public void methodone () {
    	
    	String fullName = "Happy Kassaye";
    	int sisAge = 40;
    	
    	System.out.println ("countryOrigin" + countryOrigin);
    	System.out.println ("currentCountry" + currentCountry);
    }
	
    
    public void methodtwo () {
    	
    	String fullName = "Ruth Kassaye";
    	int sisAge = 32;
    	
    	System.out.println ("Full name" + fullName);
    	System.out.println ("Sister Age"+ sisAge);
    	
    }
    
    // To perform java code, I need to create the Main Method as follows
    
    public static void main (String [] args) {
    	
    	InstanceVariableDemo r2 = new InstanceVariableDemo ();
    	
    	r2.methodone ();
//    	r2.methodtwo();
    	
   
   // If I want to change the instance variable we use the following code
    	
    	r2.currentCountry = "U.S.A"; // note change in the instance variable affects all the print out of all methods
    	
  // We can create multiple objects in one class as follows:
    	
    	
    	InstanceVariableDemo r3 = new InstanceVariableDemo ();
    	r3. countryOrigin = "Germany"; // overridding when I want to change the instance value
    	
    	r3.methodone ();
//    	r3.methodtwo();
//    	r3. countryOrigin = "Germany"; // overridding when I want to change the instance value
    	
    	
    	InstanceVariableDemo r4 = new InstanceVariableDemo ();
    	r3. countryOrigin = "Kenya";
    	r3.methodone ();
//    	r3.methodtwo();
//    	r3. countryOrigin = "Kenya";
    	
    }
    
}
