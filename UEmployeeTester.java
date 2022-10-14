/**
 * 
 */
package inheritanceAssignment;

import java.util.*;

/**
 * @title UEmployeeTester
 * @author sep
 * @date April 28, 2022
 * @desc This program tests a UI for adding and managing UEmployee children objects.
 */
public class UEmployeeTester {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<UEmployee> uemployees = new ArrayList<UEmployee>();
		ArrayList<Faculty> facultyMembers = new ArrayList<Faculty>();
		ArrayList<Staff> staffMembers = new ArrayList<Staff>();
		boolean done = false; 
		while (!done) {
			System.out.println("\n0: Enter new university employee\n"
					+ "1: Edit employee details\n"
					+ "2: Display university employees\n"
					+ "3: Display Faculty\n"
					+ "4: Display Staff\n"
					+ "5: Quit\n");
			System.out.print("Enter Choice: "); 
			int choice = scanner.nextInt();
			switch(choice) {
				case 0:
					System.out.print("\nEnter Employee Name: ");
					String name = scanner.next();
					System.out.print("\nEnter Employee Salary: ");
					double salary = scanner.nextDouble();
					System.out.print("Select Employee Type, enter 0 for staff member and 1 for faculty member. Enter any other number to exit: ");
					int choice2 = scanner.nextInt();
					if (choice2 == 0) {
						System.out.print("Enter Employee Job Title: ");
						String job = scanner.next();
						Staff newStaff = new Staff(name, salary, job);
						staffMembers.add(newStaff);
						uemployees.add(newStaff);
					} else if (choice2 == 1) {
						System.out.print("Enter Employee Department: ");
						String department = scanner.next();
						Faculty newStaff = new Faculty(name, salary, department);
						facultyMembers.add(newStaff);
						uemployees.add(newStaff);
					} else {
						System.out.println("Unknown input. Terminating.");
					}
					break;
				case 1:
					if (uemployees.size() <= 0)
						System.out.println("No university employees to display.");
					else {
						for (int i = 0; i < uemployees.size(); i++) {
							System.out.println("");
							System.out.print(uemployees.get(i).getName());
							System.out.printf(" (%s)\n", i + 1);
						}
						System.out.print("\nSelect employee by entering corresponding number: ");
						int employeeIndex = scanner.nextInt() - 1;
						UEmployee chosenEmployee = uemployees.get(employeeIndex);
						System.out.println("\nChosen employee: ");
						System.out.println("");
						System.out.println(chosenEmployee.toString());
						System.out.println("\n0: Change Name\n"
								+ "1: Change Salary\n"
								+ "2: Change Department / Job Title \n");
						System.out.print("Enter Choice: ");
						int choice3 = scanner.nextInt();
						if (choice3 == 0) {
							System.out.print("\nEnter new name: ");
							String newName = scanner.next();
							chosenEmployee.setName(newName);
							System.out.println("\nName set.");
						} else if (choice3 == 1) {
							System.out.print("\nEnter new salary: ");
							double newSalary = scanner.nextDouble();
							chosenEmployee.setSalary(newSalary);
							System.out.println("\nSalary set.");
						} else if (choice3 == 2) {
							if (chosenEmployee.getClass() == Faculty.class) {
								System.out.print("\nEnter new department: ");
								String newDpt = scanner.next();
								((Faculty)chosenEmployee).setDepartment(newDpt);
								
							} else if (chosenEmployee.getClass() == Staff.class) {
								System.out.print("\nEnter new job title: ");
								String newTitle = scanner.next();
								((Staff)chosenEmployee).setJobTitle(newTitle);
							}
						}
							
					}
					
					break;
				case 2:
					if (uemployees.size() <= 0)
						System.out.println("No university employees to display.");
					else {
						for (UEmployee employee: uemployees) {
							System.out.println("");
							System.out.println(employee.toString());
						}
					}
					break;
				case 3:
					if (facultyMembers.size() <= 0)
						System.out.println("No faculty to display.");
					else {
						for (Faculty faculty: facultyMembers) {
							System.out.println("");
							System.out.println(faculty.toString());
						}
					}
					break;
				case 4:
					if (staffMembers.size() <= 0)
						System.out.println("No staff to display.");
					else {
						for (Staff staff: staffMembers) {
							System.out.println("");
							System.out.println(staff.toString());
						}
					}
					break;
				case 5:
					System.out.println("Terminating.");
					done = true;
					break; 
			}
		}
		scanner.close();
	}		

}


/*
init scanner
ArrayList<UEmployee> uemployees = new ArrayList<UEmployee>();
ArrayList<Faculty> facultyMembers = new ArrayList<Faculty>();
ArrayList<Staff> staffMembers = new ArrayList<Staff>();
done = false; 
while (!done) {
	println("\n0: Enter new university employee\n"
			+ "1: Edit employee details\n"
			+ "2: Display university employees\n"
			+ "3: Display Faculty\n"
			+ "4: Display Staff\n"
			+ "5: Quit\n");
	print("Enter Choice: "); 
	choice = scanner.nextInt();
	switch(choice) {
		case 0:
			print("\nEnter Employee Name: ");
			name = scanner.next();
			print("\nEnter Employee Salary: ");
			double salary = scanner.nextDouble();
			print("Select Employee Type, enter 0 for staff member and 1 for faculty member. Enter any other number to exit: ");
			int choice2 = scanner.nextInt();
			if (choice2 == 0) {
				print("Enter Employee Job Title: ");
				job = scanner.next();
				newStaff = new Staff(name, salary, job);
				staffMembers.add(newStaff);
				uemployees.add(newStaff);
			} else if (choice2 == 1) {
				print("Enter Employee Department: ");
				department = scanner.next();
				newStaff = new Faculty(name, salary, department);
				facultyMembers.add(newStaff);
				uemployees.add(newStaff);
			} else {
				println("Unknown input. Terminating.");
			}
			break;
		case 1:
			if (uemployees.size() <= 0)
				println("No university employees to display.");
			else {
				for (int i = 0; i < uemployees.size(); i++) {
					println("");
					print(uemployees.get(i).getName());
					printf(" (%s)\n", i + 1);
				}
				print("\nSelect employee by entering corresponding number: ");
				employeeIndex = scanner.nextInt() - 1;
				chosenEmployee = uemployees.get(employeeIndex);
				println("\nChosen employee: ");
				println("");
				println(chosenEmployee.toString());
				println("\n0: Change Name\n"
						+ "1: Change Salary\n"
						+ "2: Change Department / Job Title \n");
				print("Enter Choice: ");
				int choice3 = scanner.nextInt();
				if (choice3 == 0) {
					print("\nEnter new name: ");
					newName = scanner.next();
					chosenEmployee.setName(newName);
					println("\nName set.");
				} else if (choice3 == 1) {
					print("\nEnter new salary: ");
					newSalary = scanner.nextDouble();
					chosenEmployee.setSalary(newSalary);
					println("\nSalary set.");
				} else if (choice3 == 2) {
					if (chosenEmployee.getClass() == Faculty.class) {
						print("\nEnter new department: ");
						String newDpt = scanner.next();
						((Faculty)chosenEmployee).setDepartment(newDpt);
						
					} else if (chosenEmployee.getClass() == Staff.class) {
						print("\nEnter new job title: ");
						String newTitle = scanner.next();
						((Staff)chosenEmployee).setJobTitle(newTitle);
					}
				}
					
			}
			
			break;
		case 2:
			if (uemployees.size() <= 0)
				println("No university employees to display.");
			else {
				for (UEmployee employee: uemployees) {
					println("");
					println(employee.toString());
				}
			}
			break;
		case 3:
			if (facultyMembers.size() <= 0)
				println("No faculty to display.");
			else {
				for (Faculty faculty: facultyMembers) {
					println("");
					println(faculty.toString());
				}
			}
			break;
		case 4:
			if (staffMembers.size() <= 0)
				println("No staff to display.");
			else {
				for (Staff staff: staffMembers) {
					println("");
					println(staff.toString());
				}
			}
			break;
		case 5:
			println("Terminating.");
			done = true;
			break; 
	}
}
scanner.close();
*/