package ToLearnStaticBlock;

public class Plane implements Flyable{
	int count;
	public Plane(int a){
		this.count = a;
	}
	
	public void fly(){
		System.out.println("Plane");
	}
}
