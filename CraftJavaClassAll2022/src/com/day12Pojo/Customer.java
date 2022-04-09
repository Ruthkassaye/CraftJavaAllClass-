package com.day12Pojo;

public class Customer { 
	
/* Pojo demo: in Pojo a class should not inherit another class, instead of inheriting/extedning
 * to another class it uses getter and setter 
 * and it methods and variables should follow encapsulation principles, 
 * i.e. the variables should be private and methods should be public 
 */

		private int age;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		private String name;
		public double salary;
	}


