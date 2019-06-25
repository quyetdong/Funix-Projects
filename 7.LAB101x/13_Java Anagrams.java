package string;

import java.io.*;
import java.util.*;

public class JavaAnagrams {
	static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] charA = a.toLowerCase().toCharArray();
        char[] charB = b.toLowerCase().toCharArray();
        
        Arrays.sort(charA);
        Arrays.sort(charB);
        
        return Arrays.equals(charA, charB);
        
    }
	
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}