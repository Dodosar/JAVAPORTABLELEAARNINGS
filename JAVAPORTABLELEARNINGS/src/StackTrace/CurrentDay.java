package StackTrace;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
����� ������� �����?
*/

public class CurrentDay {

    public static void main(String[] args) throws Exception {
        //�������� ��� ��� ���
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	Date currentDate = null;
		currentDate = new Date(reader.readLine());
    	SimpleDateFormat Dateformat = new SimpleDateFormat("MMM dd,yyyy",Locale.GERMANY);
    	System.out.println(Dateformat.format(currentDate).toUpperCase());
    }
}
