public class LengthString {
	
	public static void main(String[] args) {
		System.out.println("Calculate the length of an array:");
		string_length();
	}
	
	public static void string_length() {
		String[] inp_string = {"ha", "kb", "lo", "bye"};
		
		int k = inp_string[0].compareTo(inp_string[1]);
		int length = inp_string.length;
		System.out.printf("Compare: %d\nThe length of this string is: %d\n", k, length);	
	}
}