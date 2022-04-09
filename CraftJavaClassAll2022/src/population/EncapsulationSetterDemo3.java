package population;

public class EncapsulationSetterDemo3 {

	// setters allows values to be added in another class. 
	
	// // right click on a blank space, select 'Source' and select 'Generate getters and setters'. click on 'Setters' 
	
	private String empFname;
	private String empLname;
	private int empAge;
	private double empSalary;
	private double empBonus;
	
	
	
	public void setEmpFname(String empFname) {
		this.empFname = empFname;
	}
	public void setEmpLname(String empLname) {
		this.empLname = empLname;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public void setEmpBonus(double empBonus) {
		this.empBonus = empBonus;
	}
	
	
	public String getEmpFname() {
		return empFname;
	}
	public String getEmpLname() {
		return empLname;
	}
	public int getEmpAge() {
		return empAge;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public double getEmpBonus() {
		return empBonus;
	}
	
	
	
	
	
	
	
	
}
