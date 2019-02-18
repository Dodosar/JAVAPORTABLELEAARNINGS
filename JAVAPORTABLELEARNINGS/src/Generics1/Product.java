package Generics1;

public class Product<T extends Product<T>> implements Comparable<T> {
	
	private String name;	
	private int price;

	public Product(String name,int price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}
	
	/*abstract void SubCompare(T p);*/

	@Override
	public int compareTo(T p) {
		// TODO Auto-generated method stub
		final int BEFORE = -1;
	    final int EQUAL = 0;
	    final int AFTER = 1;
	    int a = 0;
	    //this optimization is usually worthwhile, and can
	    //always be added
	    if (this == p){
	    	return  a = EQUAL;
	    	}
	    else if(this != p){
	    	return a = AFTER;
	    }
		return a;


	}
}
