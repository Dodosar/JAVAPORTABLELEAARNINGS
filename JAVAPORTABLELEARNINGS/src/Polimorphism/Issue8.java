package Polimorphism;

public class Issue8 {
    public static void main(String[] args) {
        Human human = new Human();
        human.workHard();
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Worker,Secretary,Businessman{

        public void workHard() {
        	System.out.println("workHard");
        }

        public void workLazy() {
        	System.out.println("workLazy");
        }

    }
}
