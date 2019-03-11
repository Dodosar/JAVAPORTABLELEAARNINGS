package ReferenceMethod;

import java.util.function.BiFunction;  


//https://beginnersbook.com/2017/10/java-functional-interfaces/

//https://beginnersbook.com/2017/10/method-references-in-java-8/
class Multiplication{  
   public static int multiply(int a, int b){  
	return a*b;  
   }  
}  
public class Example {  
   public static void main(String[] args) {  
	BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
	int pr = product.apply(11, 5);  
	System.out.println("Product of given number is: "+pr);  
   }  
}