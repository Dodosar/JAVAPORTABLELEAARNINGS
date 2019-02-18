package ThreadSleep;

import java.util.ArrayList;
import java.util.List;

public class Issue1627 {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("������ ����");
            steps.add("���� ��������");
            steps.add("���� ���������");
            steps.add("�������� ������");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 3);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Sidorov", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            //Add your code here - ������ ��� ���
        	for(int i = 0;i < OnlineGame.steps.size();i++){
        	try{       		
        		System.out.println(getName()+ ":" + OnlineGame.steps.get(i));  
        		Thread.sleep(1000/rating);
        	}        	
        	catch(InterruptedException e){  
        		System.out.println(this.getName() + ":��������");
        		return;
        	}
        	}
    		if(!OnlineGame.isWinnerFound){
    		System.out.println(getName()+ ":����������!");   
    		OnlineGame.isWinnerFound = true;
    		return;
    		/*if ��� ��������� ��� ������ ������������ ������ ���� �������� � �������� 
    		 * �����������. �� ���� �� ��������� ����� �� ������� � ������ ��������,
    		 *  �.�. ���������� ���� while � ������ OnlineGame � ����� ����� ������ ������� 
    		 *  ���������� interrupt(), ��� � ���� ������� � ����������� ����� �������� InterruptException. 
    		 *  ������? ������, ��� ���� ����� ��������� � ��������� ���������� � ��� ���� ���� ������� ���
    		 *   ���������� ���� sleep, ���� wait - ������������� �������������� ����������. 
    		 *   � return; �������������� �������� ������ ���� � �����������. ��������!!!*/
    		 
    		}
        }        
    }
}
