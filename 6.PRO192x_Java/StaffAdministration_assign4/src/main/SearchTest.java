package main;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import formatinfor.Employee;
import formatinfor.Lecturer;
import formatinfor.Staff;

class SearchTest {
	AdminData adm = new AdminData();
	ArrayList<Employee> employee = new ArrayList<Employee>();

	/** Set employee list */
	ArrayList<Employee> getEmployeeList() {
		ArrayList<Employee> employee = new ArrayList<Employee>();
		
		Staff st = new Staff("Nguyen Van A", "linguistics", "staff", (float) 3.5, 32);
		Lecturer lt = new Lecturer("Le Van B", "science", "master", (float) 3.6, 32);	
		
		employee.add(st);
		employee.add(lt);
		
		return employee;
	}
	
	/** Test for search method in case of find out employee in the list */	
	@Test
	void testFound() {		
		ByteArrayInputStream in = new ByteArrayInputStream("nguyen van a \n linguistics".getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(in);
		
		adm.setEmployee(getEmployeeList());
		
		assertEquals(1, adm.searchInfor(sc));
		
		System.out.println("Successful found test for search employee method!".toUpperCase());
		System.setIn(System.in);
	}

	/** Test for search method in case of there is no employee matched searching */	
	@Test
	void testNotFound() {		
		ByteArrayInputStream in = new ByteArrayInputStream("H \n linguistics".getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(in);
		
		adm.setEmployee(getEmployeeList());
		
		assertEquals(0, adm.searchInfor(sc));
		
		System.out.println("Successful not found test for search employee method!\n".toUpperCase());
		System.setIn(System.in);
	}	
}
