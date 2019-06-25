import java.util.Scanner;

public class Solution {
    public static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */
        int yearNum = Integer.parseInt(year);
        int monthNum = Integer.parseInt(month);
        int dayNum = Integer.parseInt(day);
        int days, num, aFeb;
        String strDay;
    
        if(yearNum%4 == 0) aFeb = 1;
        else aFeb = 2;
        
        if(yearNum > 1920) {        
        	days = (yearNum-1920) * 365 + (yearNum-1921)/4 + 1;
        }
        else {
            days = (1920-yearNum) * 365 + (1920-yearNum)/4;
            days = 7-days%7;
        }
        
        days = days + (monthNum - 1) * 31;
        if(monthNum < 3) days = days + dayNum;
        else if(monthNum <= 8) days = days - (monthNum -1)/2 - aFeb + dayNum;
        else days = days - (monthNum - 8)/2 - 3 - aFeb + dayNum;
            
        num = days % 7;
        switch(num){
            case 1: 
                strDay = "Thursday";
                break;
            case 2:
                strDay = "Friday";
                break;
            case 3:
                strDay = "Saturday";
                break;
            case 4:
                strDay = "Sunday";
                break;
            case 5:
                strDay = "Monday";
                break;
            case 6:
                strDay = "Tuesday";
                break;
            default:
                strDay = "Wednesday";

        }
        
        return strDay.toUpperCase();
    }
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}	