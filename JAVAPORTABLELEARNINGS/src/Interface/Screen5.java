package Interface;

public class Screen5 {

    public static void main(String[] args) throws Exception {

        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().toString());

    }

    interface Desire {
       
    }

    interface Dream {
         public Hobbie HOBBIE = new Hobbie();
    }

    public static class Hobbie implements Dream,Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}