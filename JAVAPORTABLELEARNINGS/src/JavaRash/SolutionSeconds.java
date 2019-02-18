package JavaRash;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SolutionSeconds {
		
	public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
    	int a = 60;
    	Date objDate = new Date();
		System.out.println(objDate);
		String formatDate = "hh:mm:ss";
		SimpleDateFormat objFormat = new SimpleDateFormat(formatDate);
		System.out.println(objFormat.format(objDate));
		int minutes = objDate.getMinutes();
		System.out.println(minutes);
		int seconds1 = minutes*(-a);
    	return seconds1;
        //напишите тут ваш код
        
    }
}
