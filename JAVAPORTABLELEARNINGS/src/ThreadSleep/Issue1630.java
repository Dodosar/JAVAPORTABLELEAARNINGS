package ThreadSleep;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Issue1630 {
    public static String firstFileName;
    public static String secondFileName;

    static{ //add your code here - добавьте код тут
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	try {
			firstFileName = reader.readLine();
			secondFileName = reader.readLine();
		} catch (IOException e) {
		}
    }


    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        /*f.setFileName(fileName);*/
        f.start();
        //add your code here - добавьте код тут
        f.join();        
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
    
    public static class ReadFileThread extends Thread implements ReadFileInterface{
    	private String fileName;
		@Override
		public void setFileName(String fullFileName) {
			// TODO Auto-generated method stub
			this.fileName = fullFileName;
		}

		@Override
		public String getFileContent() {
			// TODO Auto-generated method stub		"F:\\test.txt"
			String words;
			String wordsWithSplit = "";
			try(FileReader readFile = new FileReader("F:\\test.txt");
					BufferedReader br = new BufferedReader(readFile);)
			{
				while((words = br.readLine()) != null){
					wordsWithSplit += words + " "; 
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return wordsWithSplit;

		}
		
		public void run(){
			getFileContent();
		}    	
    }
    
    //add your code here - добавьте код тут
}
