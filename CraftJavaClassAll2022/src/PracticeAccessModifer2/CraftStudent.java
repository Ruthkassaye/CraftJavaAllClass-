package PracticeAccessModifer2;

import PracticeAccessModifier1.Kedru;
import PracticeAccessModifier1.Ruth;

public class CraftStudent extends Kedru {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CraftStudent craft = new CraftStudent (); // we have created inheritance. 
		System.out.println(craft.age);
		System.out.println(craft.salary);
		System.out.println(craft.bonus);
		
		System.out.println("........");
		
		Ruth craft1= new Ruth ();// we have to import Ruth here 
		System.out.println(craft1.age);
		System.out.println(craft1.salary);
		System.out.println(craft1.bonus);
		
		
	}

}
