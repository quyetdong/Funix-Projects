package admininfor;

/* 
 * Specify methods to work with staff data
 */

import java.util.Scanner;
import formatinfor.*;

public class StaffData {
	private Scanner sc = new Scanner(System.in);
	
	public Staff inputStaff() {
		Staff st;

		System.out.println("Input fullname:");
		String name = sc.nextLine().trim();
		
		System.out.println("Input Department:");
		String department = sc.nextLine().trim();
		
		System.out.println("Input position:");
		String position = sc.nextLine().trim();
		
		System.out.println("Input work days count:");
		float workDays = inpFloat();
		
		System.out.println("Input salary rate:");
		float salaryRate = inpFloat();
		
		st = new Staff(name, department, position, salaryRate, workDays);
		return st;
	}	
	
	float inpFloat() {
		float opt = 0;
		
		while(true) {
			try {
				opt = sc.nextFloat();
				sc.nextLine();
				break;
			}
			catch(Exception e) {
				System.out.println("Not a number, input again!");
				sc.nextLine();
			}
		}	
		return opt;
	}
}
