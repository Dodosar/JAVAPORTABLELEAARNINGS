package ThreadSleep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
������� �������
*/

public class Issue1616 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
        	Thread current = Thread.currentThread();
            try {
            	while(!current.isInterrupted()){
            	seconds++;
            	Thread.sleep(1000);
            	}
                //add your code here - �������� ��� ���
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
