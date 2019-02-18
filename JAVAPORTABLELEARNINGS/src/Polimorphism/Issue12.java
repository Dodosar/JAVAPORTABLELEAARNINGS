package Polimorphism;

public class Issue12 {
    public static void main(String[] args) {
        Pegas horse = new Pegas();
    }

    public static interface Fly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegas extends Horse implements Fly{

		@Override
		public void fly() {

		}

    	
    }
}
