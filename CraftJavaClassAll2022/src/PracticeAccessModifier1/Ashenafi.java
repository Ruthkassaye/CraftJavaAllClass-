package PracticeAccessModifier1;

public class Ashenafi {
	public int age = 24;
	private int salary =4000;
	private double bonus =1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ashenafi a= new Ashenafi ();
		System.out.println (a.age);
		System.out.println (a.salary);
		System.out.println (a.bonus);
		
		System.out.println ("........");
		
		
		Ruth a1 = new Ruth ();
		System.out.println(a1.age);
		System.out.println(a1.salary);
		System.out.println(a1.bonus);
	}

}
