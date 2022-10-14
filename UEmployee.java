package inheritanceAssignment;

public abstract class UEmployee {
	private String name;
	private double salary;
	/**
	 * Constructor 
	 * pre: valid arguments
	 * @param newName
	 * @param newSalary
	 * post: a new 
	 */
	public UEmployee(String newName, double newSalary) {
		this.name = newName;
		this.salary = newSalary;
	}
	/**
	 * gets employee name
	 * pre: initialized name
	 * post: returned name as string
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * sets new name for employee
	 * pre: valid newName argument
	 * @param newName
	 * post: replaced name field
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	/**
	 * gets employee salary
	 * pre: initialied salary field
	 * post: returns salary var as double
	 */
	public double getSalary() {
		return this.salary;
	}
	
	/**
	 * sets new salary for employee
	 * pre: valid new salary argument
	 * @param newSalary
	 * post: replaced salary field
	 */
	public void setSalary(double newSalary) {
		this.salary = newSalary;
	}
	
	/*
	 * abstract method for employee data based on their type
	 * pre: valid vars in object
	 * post: object data of child objects returned as string. 
	 */
	public abstract String toString();
}
