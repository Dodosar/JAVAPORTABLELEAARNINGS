package Singleton2;

public final class Earth implements Planet{
		
	private int radius;
	
	private static Earth instance  = null;
	
	public static Earth getInstance(){
		if(instance  == null)
		{
			instance  = new Earth();
		}
		return instance ;
	
}

	private Earth(){
		radius = 1800;
	}
	
	public int getRadius(){
		System.out.println(radius);
		return radius;
		
	}
}
