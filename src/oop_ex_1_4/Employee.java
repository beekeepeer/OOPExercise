package oop_ex_1_4;

public class Employee{
	private int id;
	private int salary;
	private String firstName;
	private String lastName;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getID () {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public String getName() {
		String name = firstName + " " + lastName;
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	public int getAnnualSalary() {
		int annualSalary = salary*12;
		return annualSalary;
	}
	
	
	public int raiseSalary (int percent) {
		System.out.print("New salary is ");
		int newSalary = salary + salary/100*percent;
		return newSalary;
	}
	 public String toString() {
		 return "Employee: [id= " + id + ", name = " + firstName + " " + lastName +  ", salary = " + salary + "]";
	 }
}