package IssueLevel5Lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/* 
Парсер реквестов
*/

public class task1527 {
    public static void main(String[] args) throws IOException{
    	try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
    		String s = reader.readLine();
    		Pattern parseParam = Pattern.compile("([?&])(\\w+)");
    		Pattern parseObj = Pattern.compile("(\\bobj=\\b)(\\w+\\.?\\w+)");
    		Matcher m = parseParam.matcher(s);
    		Matcher n = parseObj.matcher(s);
    		while (m.find()) {
    			System.out.print(m.group(2) + " ");
    			} 
    		System.out.println();
    		while (n.find()) {
    			try { 
    				System.out.println(m.groupCount());
    				alert(Double.parseDouble(n.group(2)));
    				}
    			catch (NumberFormatException e) {
    				alert(n.group(2));
    				}
    			}
    			} 
    			catch (IOException e) { 
    			e.printStackTrace(); 
    			}
    	}

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
