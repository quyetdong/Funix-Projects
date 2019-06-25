package main;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/* 
 * Execute management 0f staff and lecturer data combination
 */

import java.util.Scanner;

import admininfor.*;
import formatinfor.Employee;
import formatinfor.Lecturer;
import formatinfor.Staff;

public class AdminData implements ProceedData {
	private ArrayList<Employee> employee= new ArrayList<Employee>();
	private StaffData staff = new StaffData();
	private LecturerData lecturer = new LecturerData();
	
	public void setEmployee(ArrayList<Employee> emps) {
		this.employee = emps;
	}
	public ArrayList<Employee> getEmployee() {
		return this.employee;
	}
	
	/** Input data of employees */
	public void inputInfor(Scanner sc) {
		System.out.println("Type the number of employees to input:");
		File file = new File("employees.txt");
		int n = inpInt(sc);
		
		for(int i=0; i<n;) {
			System.out.printf("Employee number %d: \n", i+1);
			System.out.println("Choose to input staff or input lecturer: 1.staff, 2.lecturer");
			
			int opt = inpInt("Choose again to input: 1.staff, 2.lecturer", sc);
			
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
		int next = inpInt(sc);
		if(next == 0) {
			inputInfor(sc);
		}
		
		writeInfor(file, employee);
		
	}
	
	/** Print information of a list of staff or lecturer*/
	public void printInfor() {
		int n = employee.size();
		int loop = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose to print staff or lecturer list: 1.staff list, 2.lecturer list");
		int opt = inpInt("Error, choose 1 or 2 to print a list", sc);
		
		System.out.println(headLine());
		
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
	
	/** Search employee by name and section */
	public int searchInfor(Scanner sc) {
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
				System.out.println(headLine());
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
	int inpInt(String str, Scanner sc) {
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
	int inpInt(Scanner sc) {
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
		
		System.out.println(headLine());
		
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
					String name1 = employee.get(j).getName().toLowerCase();
					String name2 = employee.get(j+1).getName().toLowerCase();
					
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
	
	/** Write data to a file */
	public void writeInfor(File file, ArrayList<Employee> emps) {
		PrintWriter pw = null;
		int i = 1;
		
		try {
			if(!file.exists()) {
				file.createNewFile();
			}			
			pw = new PrintWriter(file);				
			
		} catch(IOException e) {
			System.out.println("Error: " + e);
		}
		
		pw.println(headLine());
		
		for(Employee emp: emps) {
			pw.printf("%4d|", i++);
			
			if(emp instanceof Staff) {
				Staff st = (Staff) emp;
				
				pw.printf("%15s|", st.getName());
				pw.printf("%10s|", st.getSection());
				pw.printf("%7s|", st.getLevel());
				pw.printf("%21.1f|", st.getWorkLoad());
				pw.printf("%11.1f|", st.getSalaryRate());
				pw.printf("%10.1f|", st.getAllowance());
				pw.printf("%8.1f", st.getSalary());
						
				pw.println();
			} else {
				Lecturer ltr = (Lecturer) emp;
				
				pw.printf("%15s|", ltr.getName());
				pw.printf("%10s|", ltr.getSection());
				pw.printf("%7s|", ltr.getLevel());
				pw.printf("%21.1f|", ltr.getWorkLoad());
				pw.printf("%11.1f|", ltr.getSalaryRate());
				pw.printf("%10.1f|", ltr.getAllowance());
				pw.printf("%8.1f", ltr.getSalary());
						
				pw.println();
			}
		}
		
		pw.close();
	}
	
	/** Head line for table data */
	String headLine() {
		String s = "No. |Fullname       |Section   |Level  |WorkDay/TeachingUnit |"						   
				   + "SalaryRate |Allowance |Salary  ";
		return s;
	}
}
