import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrInt = new int[n];
        int sumSub = 0;
        int count = 0;
        
        for(int i=0; i<n; i++){
            arrInt[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            sumSub = 0;
            for(int j=i; j<n; j++){
                sumSub += arrInt[j];
                if(sumSub < 0){
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}