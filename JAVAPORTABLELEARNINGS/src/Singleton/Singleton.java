package Singleton;

public class Singleton {
	private static Singleton instance;
	public static Singleton getInstance(){
		System.out.println(instance);
		return instance;
	}
	
	private Singleton(){
	}
	
	private Singleton(Object a){
		this.instance = (Singleton)a;
	}
}
