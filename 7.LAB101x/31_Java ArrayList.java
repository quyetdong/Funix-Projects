import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;		
		int q = 0;

		ArrayList<ArrayList> intArrList2D = new ArrayList<ArrayList>();
		
		n = sc.nextInt();		
		for(int i=0; i<n; i++) {
			int d = sc.nextInt();
			ArrayList<Integer> line = new ArrayList<Integer>();
			
			for(int j=0; j<d; j++) {
				int intLine = sc.nextInt();
						
				line.add(intLine);				
			}
			intArrList2D.add(line);
		}
		
		q = sc.nextInt();
		for(int i=0; i<q; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			try {
				System.out.println(intArrList2D.get(x-1).get(y-1));
			} catch(Exception e) {
				System.out.println("ERROR!");
			}			
		}
	}
}