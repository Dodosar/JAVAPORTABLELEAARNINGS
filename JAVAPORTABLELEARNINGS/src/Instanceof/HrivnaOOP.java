package Instanceof;

public class HrivnaOOP {
    public static void main(String[] args) {
        System.out.println(new Hrivna().getAmount());
    }

    public static abstract class Money {
        abstract double getMoney();

    }

    //add your code below - добавь код ниже
    public static class Hrivna extends Money {
        public double amount = 123d;

        public double getMoney() {
            return this.amount;
        }
        
        public Object getAmount() {
            return getMoney();
        }
    }
}
