package InputOutPut;

import java.io.File;
import java.text.SimpleDateFormat;
public class LastModifiedDateExample
{
    public static void main(String[] args)
    {	
        //Specify the file path and name
	File file = new File("D:\\My_Project\\beginnersbook2.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
    }
}