package ThreadSleep;

public class Issue1622 {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
        	SleepingThread t = new SleepingThread();
        	t.join();
            //�������� ��� ��� ���
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countDownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countDownIndex == 0) return;
                //�������� ��� ��� ���
                try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("���� ��������");
				}
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countDownIndex;
        }
    }
}
