package Incapsulating;


public class IssueLast {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //Напишите тут ваше решение
        for(int i = 0; i <array.length-1; i ++){
        	for(int j = i+1; j < array.length; j++){
        		if(array[j]>array[i]){
        			int temp = array[j];
        			array[j] = array[i];
        			array[i] = temp;
        		}
        	}
        }        

        return new Pair<Integer, Integer>(array[array.length-1], array[0]);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
