package com.day3Variables;

class EmpInfo{
	String name = "Ruth Kassaye"; //instance variable
	static String city = "Middle River"; // static variable 
}
public class StaticvariableDemo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

//		System.out.println("Employee city: "+ EmpInfo.city); this could print as city is static variable
//		System.out.println("Employee name:"+ EmpInfo.name); this wont print as name instance variable. Henec I need to create an object as folows 
		
		

		EmpInfo m1 = new EmpInfo (); //I need to create an object to call the instance variable 
	    m1.name= "Mazi"; // if i want to change the instance variable only in this object 
		m1.city= "Debrezeit"; // if i want to change the static variable it will also be changed in the preceeding object 
        System.out.println("Employee name:" + m1.name); //calling the instance variable after creating an object 
        System.out.println("Employee city: " + EmpInfo.city); //calling the static variable
      
		
    	EmpInfo m2 = new EmpInfo (); 
        System.out.println("Employee name:" + m2.name); //the instance variable remain the same
        System.out.println("Employee city: " + EmpInfo.city); // because i change the static variable (city) of object 1 above it, the city will be 
                                                              //printed as Debrezeit instead of the original static variable i.e., Middle River
    
        
    	EmpInfo m3 = new EmpInfo (); 
    	m3.name= "Lidia";
    	System.out.println("Employee name:" + m3.name);
        System.out.println("Employee city: " + EmpInfo.city); //it will be printed the static variable of object 2
        
        
	}

}
