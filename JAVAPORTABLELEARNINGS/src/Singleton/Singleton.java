package Singleton;

public class Singleton {
	private static String a;
	private static Singleton instance = new Singleton();
	public static Singleton getInstance(){
		System.out.println(a);
		return instance;
	}
	
	private Singleton(){
		a = "test";
	}
	
	private Singleton(Object a){
		this.instance = (Singleton)a;
	}
}
