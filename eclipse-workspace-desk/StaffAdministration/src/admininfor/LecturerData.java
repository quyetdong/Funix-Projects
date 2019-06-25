package admininfor;

/* 
 * Specify methods to work with lecturer data
 */

import java.util.Scanner;
import formatinfor.*;

public class LecturerData {
	private Scanner sc = new Scanner(System.in);
	
	public Lecturer inputLecturer() {
		Lecturer ltr;
	
		System.out.println("Input fullname:");
		String name = sc.nextLine().trim();
		
		System.out.println("Input Faculty:");
		String faculty = sc.nextLine().trim();
		
		System.out.println("Input Degree:");
		String degree = sc.nextLine().trim();
		
		System.out.println("Input teaching-units count in classroom:");
		float units = inpFloat();
		
		System.out.println("Input salary rate:");
		float salaryRate = inpFloat();
	
		ltr = new Lecturer(name, faculty, degree, salaryRate, units);
		return ltr;
	}
	
	float inpFloat() {
		float inp = 0;
		
		while(true) {
			try {
				inp = sc.nextFloat();
				sc.nextLine();
				break;
			} catch(Exception e) {
				System.out.println("Not a number, input again!");
				sc.nextLine();
			}
		}		
		return inp;
	}
}