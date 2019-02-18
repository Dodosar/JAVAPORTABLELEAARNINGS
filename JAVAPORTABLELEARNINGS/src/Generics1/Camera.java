package Generics1;

public class Camera extends Product<Camera>{
	/*abstract void subCompare(Camera p);*/
	private float pixel;
	
	
	public Camera(String name, int price,float pixel) {
		super(name, price);
		this.pixel = pixel;
		// TODO Auto-generated constructor stub
	}


}
