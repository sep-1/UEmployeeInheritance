package inheritanceAssignment;

import java.text.NumberFormat;

public class Faculty extends UEmployee {
	private String department;
	
	/**
	 * Constructor
	 * @param name
	 * @param salary
	 * @param newDepartment
	 */
	public Faculty(String name, double salary, String newDepartment) {
		super(name, salary);
		this.department = newDepartment;
	}
	
	/**
	 * gets department of employee
	 * pre: initialized department
	 * @return
	 * post: returned department as a string
	 */
	public String getDepartment() {
		return this.department;
	}
	
	/**
	 * sets new department for employee
	 * pre: valid string parameter
	 * @param newDepartment
	 * post: department var overridden. 
	 */
	public void setDepartment(String newDepartment) {
		this.department = newDepartment;
	}
	
	/**
	 * returns faculty data as string
	 * pre: valid vars
	 * post: a string containing object data. 
	 */
	public String toString() {
		NumberFormat money = NumberFormat.getCurrencyInstance();
		String str = "Name: " + this.getName();
		str += "\nEmployee Type: Faculty";
		str += "\nSalary: " + money.format(this.getSalary());
		str += "\nDepartment: " + this.department;
		return str;
	}
}
