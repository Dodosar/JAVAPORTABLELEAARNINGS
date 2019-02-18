package JavaRushLev8;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class WorkWithDate {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
    	
    	/*GregorianCalendar  dateCal = new GregorianCalendar (2013,Calendar.MAY,01);
    	Date StringDate = dateCal.getTime();*/
    	Date StringDate = new Date(date);

    	System.out.println("StringDate"+StringDate);
    	Date CurrentDate = new Date();
    	CurrentDate.setDate(1);
    	CurrentDate.setMonth(0);

    	System.out.println(CurrentDate);
    	long daysMS =  StringDate.getTime() - CurrentDate.getTime();
    	long msDay = 24*60*60*1000;
    	int dayCount = (int) (daysMS/msDay);
    	System.out.println(dayCount);
    	if(dayCount % 2 == 0){
    		return false;
     	}
    	else{
    		return true;
    	}        
    }
}
