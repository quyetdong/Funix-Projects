package Hello;

import java.util.ArrayList;

public class Main {

	public static void print(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
        do {
            System.out.println(" j is " + j++);
            if (j == 3) { continue; }
        } while (j < 10);
		
	}

	public static void main(String[] args) {

		      // create an empty array list with an initial capacity
		      ArrayList<Double> arrlist = new ArrayList<Double>(5);

		      // use add() method to add elements in the list
		      int i = 5;
		      
		      arrlist.add(15.2);
		      arrlist.add((double) 22);
		      arrlist.add(30.3);
		      arrlist.add(40.1);

		      // adding element 25 at third position
		      arrlist.add(2,25.5);
		        
		      // let us print all the elements available in list
		      for (Double number : arrlist) {
		         System.out.println("Number = " + number);
		      }  
		   }
		
		
		
		
		
		//int[] a = new int[3];
		//a[1]=0;
		//try {
	
		//	a[1] = 8;
		//	a[3] = 5;
		//	return;
		//} catch(Exception e) {
		//	System.out.println("Catch executed!");
		//} finally {
		//	System.out.println("Finally executed!" + a[1]);
		//}
		
		//System.out.println("Done");
		
		/*Student me = new Student("Q");
		System.out.println(me.getName());*/

}
