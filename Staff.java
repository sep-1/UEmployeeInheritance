package inheritanceAssignment;

import java.text.NumberFormat;

public class Staff extends UEmployee {
	private String jobTitle;
	/**
	 * Constructor 
	 * pre: valid args
	 * @param name
	 * @param salary
	 * @param newJob
	 */
	public Staff(String name, double salary, String newJob) {
		super(name, salary);
		this.jobTitle = newJob;
	}
	
	/**
	 * returns job title 
	 * pre: initialied jobTitle var
	 * @return
	 * post: returned jobtitle as a string
	 */
	public String getJobTitle() {
		return this.jobTitle;
	}
	
	/**
	 * sets new job title
	 * pre: valid newJob string
	 * @param newJob
	 * post: replaced jobTitle string
	 */
	public void setJobTitle(String newJob) {
		this.jobTitle = newJob;
	}
	
	/**
	 * returns staff data as string
	 * pre: valid object vars
	 * post: returns object data
	 * as a string.
	 */
	public String toString() {
		NumberFormat money = NumberFormat.getCurrencyInstance();
		String str = "Name: " + this.getName();
		str += "\nEmployee Type: Staff";
		str += "\nSalary: " + money.format(this.getSalary());
		str += "\nJob Title: " + this.jobTitle;
		return str;
	}
	
}
