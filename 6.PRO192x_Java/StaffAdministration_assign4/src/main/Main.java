package main;

import java.util.Scanner;

/* 
 * Run program
 */

public class Main {
	public static void main(String[] args) {
		AdminData employee = new AdminData();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			employee.inputInfor(sc);
			employee.printInfor();
			employee.searchInfor(sc);
			
			System.out.println("Type q to quit, or anything else to continue!");
			String next = sc.nextLine();
			if(next.equals("q")) {
				break;
			}
		}
		sc.close();
	}
}
