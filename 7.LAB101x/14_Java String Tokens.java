import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        String[] ss = s.split("[ !,?\\._'@]+");
        
        if(ss.length==1 && ss[0].equals("")){
			System.out.println(0);
		}else{
			System.out.println(ss.length);
			for(String str:ss){
                System.out.println(str);
            }
		}       
    
        scan.close();
    }
}