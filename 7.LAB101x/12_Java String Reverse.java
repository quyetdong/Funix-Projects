import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int n=A.length();
        String B="";
		
        /* Enter your code here. Print output to STDOUT. */
        for(int i=n-1; i>=0; i--){
            B = B.concat(A.substring(i, i+1));
        }
        
        if(A.compareTo(B) == 0){
            System.out.println("Yes");    
        } else{
            System.out.println("No");
        }
        
        sc.close();
    }
}