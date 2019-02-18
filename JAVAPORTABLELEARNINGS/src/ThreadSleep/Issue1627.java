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
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
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
            //Add your code here - добавь код тут
        	for(int i = 0;i < OnlineGame.steps.size();i++){
        	try{       		
        		System.out.println(getName()+ ":" + OnlineGame.steps.get(i));  
        		Thread.sleep(1000/rating);
        	}        	
        	catch(InterruptedException e){  
        		System.out.println(this.getName() + ":проиграл");
        		return;
        	}
        	}
    		if(!OnlineGame.isWinnerFound){
    		System.out.println(getName()+ ":победитель!");   
    		OnlineGame.isWinnerFound = true;
    		return;
    		/*if тут необходим для потока завершившего полный цикл действий и ставшего 
    		 * победителем. Ни одна из следующих нитей не попадет в данную проверку,
    		 *  т.к. завершится цикл while в классе OnlineGame и нитям будет поданы сигналы 
    		 *  прерывания interrupt(), что в свою очередь в проигравших нитях сгенерит InterruptException. 
    		 *  Почему? Потому, что если поток находится в состоянии прерывания и при этом была вызвана его
    		 *   блокировка либо sleep, либо wait - выбрасывается вышеупомянутое исключение. 
    		 *   И return; соответственно обрубает каждую нить в отдельности. ФУУУУХХХ!!!*/
    		 
    		}
        }        
    }
}
