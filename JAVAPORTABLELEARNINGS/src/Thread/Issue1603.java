package Thread;


import java.util.ArrayList;
import java.util.List;

/* 
������ � ����
*/

public class Issue1603 {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - �������� ���� ��� ���
    	
    for (int i = 0; i < 5; i++) { 
    	list.add(new Thread(new SpecialThread()));
    	list.get(i).run();
    	}
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
