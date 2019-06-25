package formatinfor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryTest {
	Employee emp;
	
	/** Test getSalary method for staff */
	@Test
	void testStaffSalary() {
		emp = new Staff();
		
		emp.setSalaryRate(3);
		emp.setAllowance(500);	
		emp.setWorkLoad(30);
		
		assertEquals(3590, emp.getSalary());
		System.out.println("Successful test of calculating salary method for staff!");
	}
	
	/** Test getSalary method for lecturer */
	@Test
	void testLecturerSalary() {
		emp = new Lecturer();
		
		emp.setSalaryRate(3);
		emp.setAllowance(500);	
		emp.setWorkLoad(30);
		
		assertEquals(4040, emp.getSalary());
		System.out.println("Successful test of calculating salary method for employee!");
	}
}
