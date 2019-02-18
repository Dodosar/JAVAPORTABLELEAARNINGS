package Singleton2;

public final class Moon implements Planet{

	private int radius;
	
	private static Moon instance  = null;
	
	public static Moon getInstance(){
		if(instance  == null)
		{
			instance  = new Moon();
		}
		return instance ;
	
}

	private Moon(){
		radius = 5000;
	}
	
	public int getRadius(){
		System.out.println(radius);
		return radius;
		
	}
}
