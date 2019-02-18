package ThreadSleep;

public class Issue1626 {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountDownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        //Add your code here - добавь код тут
    	private int countIndexUp = 1;
    	
    	public void run(){
    		try{
    			while(true) {
    				System.out.println(toString());
    				++countIndexUp;
    				Thread.sleep(500);
    				if (countIndexUp == 6) return;    				
    			}
    		}
    		catch(InterruptedException e) {    			
    		}
    	}
    	
        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    }
    


    public static class CountDownRunnable implements Runnable {
        private int countIndexDown = Issue1626.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}

