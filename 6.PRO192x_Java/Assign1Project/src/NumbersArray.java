import java.util.*;

public class NumbersArray {
	public static void main(String[] args) {
		System.out.println("Search for maximum number in an array\n");
		numbers_array();
	}
	
	public static void numbers_array() {
		//get an array of ten integers
		Scanner sc = new Scanner(System.in);
		int size = 10;
		System.out.println("Input a sequence of ten integers.");
		int[] numbers = input_number_array(sc, size);
		sc.close();
		
		//search and print out maximum value in the array
		int max_num = max_num(numbers);
		System.out.printf("The maximum number is: %d\n", max_num);
	}
	
	public static int[] input_number_array(Scanner sc, int size) {
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		return array;
	}
	
	public static int max_num(int[] numbers) {
		int max_num = 0;
		for(int i = 0, length = numbers.length; i < length; i++) {
			if(i == 0) max_num = numbers[i];
			if(max_num < numbers[i]) max_num = numbers[i];
		}
		
		return max_num;	
	}
}
