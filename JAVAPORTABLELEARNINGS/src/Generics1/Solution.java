package Generics1;

public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container container = new Container<>();
		
		container.setItem(new Phone("Luna",11,"Nokia"));
		container.getItem();
		container.setItem(new Camera("Luna2",11,10));
		container.getItem();
		container.setItem(new Product("Car",10));
		container.getItem();
		
		
		Camera camera1 = new Camera("camera41", 10, 15);
		Camera camera2 = new Camera("camera2", 20, 25);
		
		Phone phone1 = new Phone("phone1", 10, "example");
		
		System.out.println(camera1.compareTo(camera1));
		System.out.println(camera2.compareTo(camera1));
		/*camera1.compareTo(phone1);*/ //in the type Product<Camera> is not applicable for the arguments (Phone)
		
		/*Container<Camera> container1 = new Container<>();
		container1.setItem(new Phone());*/ // Compile Error
	}

}
