import java.util.Scanner;

public class CompNumArrs {
	public static void main(String[] args) {
		comp_num_arr();
	}
	
	public static void comp_num_arr() {
		System.out.println("Input two number-arrays, each includes 5 numbers:");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input array 1:");
		double[] num_arr_1 = num_arr_input(sc, 5);
		
		System.out.println("Input array 2:");
		double[] num_arr_2 = num_arr_input(sc, 5);
		sc.close();
		
		comp_num_arrs(num_arr_1, num_arr_2);	
	}
	
	//get array from user input
	public static double[] num_arr_input(Scanner sc, int size) {
		double[] num_arr = new double[size];
		for(int i = 0; i < size; i++) {
			int j = i;
			while(j == i) {
				try {
					num_arr[i] = sc.nextInt();
					j++;	
				}
				catch(Exception e) { 
					System.out.println("Wrong format, re-input.");
					sc.nextLine();
				}			
			}
		}		
		return num_arr;
	}
	
	//Compare two number-arrays have same size
	public static void comp_num_arrs(double[] arr_a, double[] arr_b) {
		int size = arr_a.length;
		int check = 0;
		
		for(int i = 0; i < size; i++) {
			if(arr_a[i] != arr_b[i]) {
				check++;
				if(check == 1) {
					System.out.println("These arrays are not identical.\nDifferent numbers from two arrays:");
				}
				System.out.printf("arr_1[" +i+"]: %.1f\narr_2["+i+"]: %.1f\n", arr_a[i], arr_b[i]);
			}
		}
		if(check == 0) System.out.println("These arrays are identical.");
		
	}
}