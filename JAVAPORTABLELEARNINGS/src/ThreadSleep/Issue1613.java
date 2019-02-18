package ThreadSleep;

public class Issue1613 {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("������", 23, 59, 57);
        Thread.sleep(10000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            //add your code here - ������ ��� ���
        	seconds++;
        	Thread.sleep(1000);
        	if(seconds > 59){
        		seconds = 0;
        		minutes++;
        		if(minutes > 59){
        			minutes = 0;
        			hours++;
        			if(hours > 23){
        				hours = 0;
        			}
        		}
        	}
            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("� �. %s ������ �������!", cityName));
            } else {
                System.out.println(String.format("� �. %s ������ %d:%d:%d!", cityName, hours, minutes, seconds));
            }
        }
    }
}
