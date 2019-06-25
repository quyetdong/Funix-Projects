import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String sub = "";
        int n = s.length();
        
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        smallest = s.substring(0,k);
        largest = smallest;
        
        for(int i=1; i<n-k+1; i++){
            sub = s.substring(i,i+k);
            if(smallest.compareTo(sub) > 0){
                smallest = sub;
            } else if(largest.compareTo(sub) < 0){
                largest = sub;
            }               
        }
          
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
        System.out.println(getSmallestAndLargest(s, k));
    }
}
