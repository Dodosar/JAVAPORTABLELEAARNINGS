package Generics1;

public class Container<T>/*<T extends Product & Comparable<T>>*/ {
	
	private T item;

	public Container() {
		// TODO Auto-generated constructor stub		
	}

	public T getItem() {
		System.out.println(item.toString());
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
