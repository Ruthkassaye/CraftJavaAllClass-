package com.day9String;

public class StringOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//concatenation operation: to merge two string variables 
		
		
		String fullname = "Ruth" + " Kassaye"; // plus operation 
		
		System.out.println(fullname);
		System.out.println(fullname.length()); // to count the number of characters. Ruth Kassaye (total would be 12 including the space bn Ruth & Kassaye)
        System.out.println(fullname.charAt(3)); // charAt method here helps to identify the character at number 3 index 
		
        
//if I want to compare string variables 
        
       String custName = "John";
       String parentName = "Chris";
       String phoneNumber = "+251 9666052"; // this is also string as long as it is within quotation, i.e. '"
       System.out.println(custName.equals (parentName)); // result would be false because the string variables are not the same 
     
       
// To check if a string contains only digits 
       
       String mobileNumber = "567867A56";
       
       char ch;
       
       for (int i=0; i<mobileNumber.length();i++) { // using for loop 
    	   ch= mobileNumber.charAt(i);
    	   
    	System.out.println(ch);
    	if (Character.isDigit(ch)) {
    		continue;
    	}
    	
    	else {
    		System.out.println("String contains Non digits");
    	}
    	   
       }
 
// Locate a substring within a String -  indexOf
       
       String companyName = "Craft Software";
       
       System.out.println(companyName.indexOf("Software"));// to print out index number of Software. Result would be 6. 
       
       System.out.println(companyName.substring(3));// to print out string variables starting from index number 3.  Result would be " ft Software"
       System.out.println(companyName.substring(0, 6));// to print out between index number 0 and 6. result would be "Craft". The starting number if index (1) is excluded but not the last index number (6)
       
// Locate a substring within a String - indexOf
       
       String organizationName = "craft software technologies private limited company";
       String [] splitedCraft = organizationName.split(" "); // I am using here space  ( " ") as a cut point 
      
//       String [] splitedCraft = organizationName.split("s"); // If I want to use letter s as splitter, meaning letter s would be cut off from the "craft software technologies private limited company
       
       
       System.out.println(splitedCraft [1]); // to split a specific String variable; in this case to print out index at 1, result would be Craft 
     
       for (int i =0; i<splitedCraft.length; i++){ // using for loop to print out all string variables splited, 
    	   System.out.println(splitedCraft[i]); // 
       }
       
       
 // Comparing two strings using ASCII code 
       
       String countryName = "Ethiopia";
       String nextcountrName = "Kenya";
       
       System.out.println(countryName.compareTo(nextcountrName)); // The first string name of each letter would be evaluated against the second string name letters
 
       
 // String replace       
       
       String mymiddelName = "Negussie";
       
       System.out.println(mymiddelName.replace('e', 'i')); // replacing every e with i. Result would be Nigussii. replace used to replace only one character
       System.out.println(mymiddelName.replaceAll("ss", "kk")); // ReplaceAll used to replace more than 1 letter. replace every ss with kk. Result would be 'Negukkie'
       
       
//  String trim
       
       String listofName = " Kebede Alemu Chala ";
       System.out.println(listofName);
       
       System.out.println(listofName.trim()); // to trim the space before Kebede and after Chala when printing out. the space between the names wont be deleted 
       
       
// String – uppercase /lowercase
       
       
       String friendName = "Rediet";
       String friendName2 = "Shilemat";
       
       System.out.println(friendName.toLowerCase()); // print out will be rediet
       System.out.println(friendName.toUpperCase());//REDIET
   
//      if I want to write Shilemat in lower case, with only the first letter,i.e., s 
       
       String s [] = friendName2.split("h"); // split until you get h and save it under spring variable s. I am splitting starting from h becasue I want to change letter S to a lewer case 
       s [0] = s[0].toLowerCase(); //put indext 0, i.e., letter S to lower case (s)
       
       String b = friendName2.substring(1); // to but letters starting from index 1, i.e., hilemat, under string variable name variable b
 
       String finalResult = (s [0].concat(b)); // concatenating string s and string b
       System.out.println(finalResult);// result would be shilmat 
       
       
       
   //  I have changed Rediet to upperCase REDIET. What if i want to change it to Rediet     
       
       // first change it to lower case all 
       
    System.out.println(friendName.toLowerCase());
    
    String r [] = friendName.split("e");// split until you get e and save it under spring variable r
    r [0] = r [0].toUpperCase(); // put index 0, i.e., letter r to uppercase (r)
    
    String r2 = friendName.substring(1); // to but letters starting from index 1, i.e., ediet, under string variable name variable r2
    
    String finalResult2 = (r[0].concat(r2)); //concatenating string r and string r2
       
       System.out.println(finalResult2);// final result would be Rediet 
       
       
 // String buffer = string would be mutable meaning string object is changeable 
       
       StringBuffer fname = new StringBuffer ("abebeb");
       
       System.out.println(fname.insert(1, " chala"));// result would be a chalabebeb 
       System.out.println(fname);// the result would be a chalabebeb. 
       
       
 // palindrome: it is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.
       
       StringBuffer Name = new StringBuffer ("abeba");
    
       System.out.println(Name.reverse()); // reverse method here helps us to identify if a string name is palindrome
 
       
  // to change integer, double variables to string variable
       
       // example 1
       
       int a =7;
       
       String c = Integer.toString(a);
       System.out.println(c); // the result would be empty but  I have changed int a value to String 
       
       // example 2
       
       double d =251;
       
       String e = "+" + Double.toString(d); // if i want to add + sign 
       System.out.println(e); // the result would be +251.0
       
// from string to integer, double, long, 
       
      String k = "251";
      
      int j = Integer.parseInt(k); // to convert from string to integer . Note that to do this the string must have numerical values 
      double m = Double.parseDouble(k);// to convert from string to double 
      Long Z = Long.parseLong(k);
      System.out.println(k); // result would be 251 as integer 
      System.out.println(k);
	}

}
