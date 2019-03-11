package InputOutPut;



import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
public class JavaExample {  
    public static void main(String[] args) throws FileNotFoundException {

       FileOutputStream fileOutputStream = new FileOutputStream("D:\\My_Project\\beginnersbook.txt");
       try(FileOutputStream fileOutputStream2 = fileOutputStream){ 
            String mystring = "We are writing this line in the output file."; 
            
            byte bytes[] = mystring.getBytes();       
            fileOutputStream2.write(bytes);      
            System.out.println("The given String is written in the file successfully");           
        }catch(Exception e) {  
            System.out.println(e);  
        }         
    }  
}