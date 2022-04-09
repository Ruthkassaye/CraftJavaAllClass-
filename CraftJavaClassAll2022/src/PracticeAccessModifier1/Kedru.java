package PracticeAccessModifier1;

public class Kedru {

	protected int age = 28;// default variable 
	protected int salary =4000;
	protected double bonus =1400;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hanna k = new Hanna ();
		
		Kedru K1 = new Kedru ();
		
		System.out.println (k.age);
		System.out.println(k.bonus);
		System.out.println(k.salary);
		
		
		System.out.println (K1.age);
	}

}
