package IssueLevel5Lecture12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
 Файл в статическом блоке
 */

public class ExceptionIssue {
	public static List<String> lines = new ArrayList<String>();

	public static void readFile() throws IOException {
		try {
			BufferedReader text = new BufferedReader(new FileReader(
					task15251.FILE_NAME));
			String c;
			while ((c = text.readLine()) != null) {
				System.out.println(c);
				lines.add(c);
			}
			text.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.err.println("Error for Exception");

		}
	}

	public static void main(String[] args) throws IOException {
		readFile();
		System.out.println(lines);
	}

}
