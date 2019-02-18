package JavaRash;

public class SolutionSummaThreeIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigitsInNumber(546));
		for(int i=0; i<11; i++){
            System.out.println("Я хочу большую зарплату, и для этого изучаю Java");
        }
    }

    public static int sumDigitsInNumber(int number) {

    	int a = 0;
    	while (number > 0){
    		a+= number % 10;
    		System.out.println(a);
    		number /= 10;
    		System.out.println(number);
    	}
    	return a;
        //напишите тут ваш код
    	 
    }

    
}
