import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x=0;
        int y=0;
        int z=0;
        
        try{
            x = sc.nextInt();
            y = sc.nextInt();
            z = x/y;
            
        } catch(ArithmeticException e){
            System.out.println(e);
            return;
        } catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
            return;
        } catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println(z);
    }
}