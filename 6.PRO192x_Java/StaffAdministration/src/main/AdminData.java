package main;

import java.util.ArrayList;

/* 
 * Execute management 0f staff and lecturer data combination
 */

import java.util.Scanner;

import admininfor.LecturerData;
import admininfor.StaffData;
import formatinfor.Employee;
import formatinfor.Lecturer;
import formatinfor.Staff;

public class AdminData implements ProceedData {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Employee> employee= new ArrayList<Employee>();
	private StaffData staff = new StaffData();
	private LecturerData lecturer = new LecturerData();
	
	public ArrayList<Employee> getEmployee() {
		return employee;
	}
	
	/** Input data of employees */
	public void inputInfor() {
		System.out.println("Type the number of employees to input:");
		int n = inpInt();
		
		for(int i=0; i<n;) {
			System.out.printf("Employee number %d: \n", i+1);
			System.out.println("Choose to input staff or input lecturer: 1.staff, 2.lecturer");
			
			int opt = inpInt("Choose again to input: 1.staff, 2.lecturer");
			
			if(opt == 1) {
				Staff st = staff.inputStaff();
				employee.add(st);
				
				printAll();
				i++;
			} else {
				Lecturer ltr = lecturer.inputLecturer();
				employee.add(ltr);
				
				printAll();
				i++;
			}
		}
		arrangeInfor();
		
		System.out.println("Type 0 to continue input or another number to go next!");
		int next = inpInt();
		if(next == 0) {
			inputInfor();
		}
	}
	
	/** Print information of a list of staff or lecturer*/
	public void printInfor() {
		int n = employee.size();
		int loop = 0;
		
		System.out.println("Choose to print staff or lecturer list: 1.staff list, 2.lecturer list");
		int opt = inpInt("Error, choose 1 or 2 to print a list");
		
		System.out.println("No. |Fullname      |Section  |Level  |WorkDay/TeachingUnit |"
				   +"SalaryRate |Allowance |Salary  ");
		
		for(int i=0; i<n; i++) {
			Employee emp = employee.get(i);
			
			
			if(emp instanceof Staff) {
				if(opt == 1) {
					System.out.printf("%4d|", loop+1);
					
					Staff st = (Staff) employee.get(i);
					st.printInfor();
					
					loop++;
				}
			} else {
				if(opt == 2) {
					System.out.printf("%4d|", loop+1);
					
					Lecturer ltr = (Lecturer) employee.get(i);
					ltr.printInfor();
					
					loop++;
				}
			}		
		} 
	}
	
	/** search employee by name and section */
	public int searchInfor() {
		int n = employee.size();
		int result = 0;
		System.out.println("Search by Name and Department/Faculty");
		
		System.out.println("Input name:");
		String name = sc.nextLine();
		name = name.trim().toLowerCase();
		
		System.out.println("Input department or faculty:");
		String department = sc.nextLine();
		department = department.trim().toLowerCase();
		
		for(int i=0; i<n; i++) {
			Employee emp = employee.get(i);
			
			String eFullName = emp.getName().toLowerCase();
			String[] eName = eFullName.split(" ");
			
			String eDepartment = emp.getSection().toLowerCase();
			
			if((name.equals(eName[eName.length-1]) || name.equals(eFullName)) &&
					department.equals(eDepartment) ) {
				System.out.println("No. |Fullname      |Section  |Level  |WorkDay/TeachingUnit |"
						   +"SalaryRate |Allowance |Salary  ");
				System.out.printf("%4d|", result+1);
				
				if(emp instanceof Staff) {					
					Staff st = (Staff) emp;
					st.printInfor();
				} else {
					Lecturer ltr = (Lecturer) emp;
					ltr.printInfor();
				}
				
				result++;
			}		
		}
		
		if(result == 0) {
			System.out.println("Not found!");
		}
		
		return result;
	}
		
	/** Get number 1 or 2 from input*/
	int inpInt(String str) {
		int opt = 0;
		
		while(opt != 1 && opt != 2) {
			try {
				opt = sc.nextInt();
				sc.nextLine();
			}
			catch(Exception e) {
				System.out.println(str);
				sc.nextLine();
			}
		}	
		return opt;
	}
	
	/** Get an Integer from input*/
	int inpInt() {
		int opt = 0;
		
		while(true) {
			try {
				opt = sc.nextInt();
				sc.nextLine();
				break;
			}
			catch(Exception e) {
				System.out.println("Not an Integer!");
				sc.nextLine();
			}
		}	
		return opt;
	}
	
	/** Print all list of employee */
	public void printAll() {		
		int n = employee.size();
		
		System.out.println("No. |Fullname      |Section  |Level  |WorkDay/TeachingUnit |"
						   +"SalaryRate |Allowance |Salary  ");
		
		for(int i=0; i<n; i++) {
			Employee emp = employee.get(i);
			
			System.out.printf("%4d|", i+1);
			if(emp instanceof Staff) {
				Staff st = (Staff) employee.get(i);
				st.printInfor();
			} else {
				Lecturer ltr = (Lecturer) employee.get(i);
				ltr.printInfor();
			}		
		} 
	}

	/** arrange the list by alphabet */
	public void arrangeInfor() {
		if(employee.size() <= 1) {
			return;
		} else if(employee.size() > 1) {
			int n = employee.size();
			
			for(int k=1; k<n; k++) {
				int check = 0;
				
				for(int j=0; j<n-k; j++) {
					String name1 = employee.get(j).getName();
					String name2 = employee.get(j+1).getName();
					
					if(name1.compareTo(name2) > 0) {
						check = 1;
						
						Employee emp = employee.get(j);
						employee.set(j, employee.get(j+1));
						employee.set(j+1, emp);
					}
				}
				
				if(check == 0) {
					break;
				}
			}
		}
	}		
}
