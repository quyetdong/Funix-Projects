import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		BigInteger big1 = new BigInteger(str1);
		BigInteger big2 = new BigInteger(str2);
		
		BigInteger addBig = big1.add(big2);
		BigInteger mulBig = big1.multiply(big2);
		
		System.out.println(addBig);
		System.out.println(mulBig);
    }
}