import java.util.*;

public class MaxMin {
	public static void main(String[] args) {
		System.out.println("Search for maximum number and minimum number in a sequence of three numbers.\n");
		max_min();
	}
	
	public static void max_min() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		double[] numbers = new double[3];
		
		for (int i = 0, length = numbers.length; i < length; i++)
		{
			numbers[i] = sc.nextDouble();
		}
		sc.close();
		
		double max = max(numbers), min = min(numbers);
		
		System.out.println("Maximum number is: " + max);
		System.out.println("Minimum number is: " + min);
		
	}
	
	public static double max(double[] numbers) {
		double max = 0;
		for (int i = 0, length = numbers.length; i < length; i++) {
			if(i == 0) {
				max = numbers[i];
			}
			else if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		
		return max;
	}
	
	public static double min(double[] numbers) {
		double min = 0;
		for (int i = 0, length = numbers.length; i < length; i++) {
			if(i == 0) {
				min = numbers[i];
			}
			else if(min > numbers[i]) {
				min = numbers[i];
			}
		}
		
		return min;
	}	
}

