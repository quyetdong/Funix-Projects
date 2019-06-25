import java.util.Scanner;

public class SymmString {
	public static void main(String[] args) {
		System.out.println("Check a string is symmetrical or not\n");
		symm_str();
	}
	
	public static void symm_str() {
		System.out.println("Input a string:");	
		Scanner sc = new Scanner(System.in);
		String inp_string = sc.next();
		int check = 1;
		sc.close();
		
		for(int i = 0, length = inp_string.length(); i < length/2; i++) {
			if(inp_string.charAt(i) != inp_string.charAt(length - i - 1))
				check = 0;
		}
		
		if(check == 0) System.out.println("This is not a symmetrical string.");
		else System.out.println("This string is symmetrical.");	
	}
}