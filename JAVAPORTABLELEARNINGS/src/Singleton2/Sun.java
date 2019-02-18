package Singleton2;

public class Sun implements Planet{

	private int radius;

	private Sun(){
		radius = 1500;
	}
	
	public int getRadius(){
		System.out.println(radius);
		return radius;
		
	}
	
	private static Sun instance  = null;
	
	public static Sun getInstance(){
		if(instance  == null)
		{
			instance  = new Sun();
		}
		System.out.println("sun");
		return instance ;
	}



}
