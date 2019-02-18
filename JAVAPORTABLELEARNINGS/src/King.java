
public class King implements Dilly{

	int helth,magic;
	String name;
	
	King(int helth,int magic,String name){
		this.helth=helth;
		this.magic=magic;
		this.name=name;
	}
	
	public void makeSomeBodyHurt(King king) {
		if(magic>40){
			System.out.println("King " + name + " atack");
			magic=magic-40;
			king.helth=king.helth-10;
			System.out.println(name + " magic" + magic + ".");
			System.out.println(king.name + " helth" + king.helth + ".");
		}
		else{
			System.out.println(name + " not have a lot of magic to atack");
		}
		System.out.print("");
	}
	
	public void cureThemself() {
		System.out.println("King " + name + " treated");
	if(magic>70){
		magic=magic-70;
		helth=helth+30;
		System.out.println("King " + helth + " helth have now");
		System.out.println("King have " + magic + " now");
	}
	else{
		System.out.println("King dont have a lot of magic to treated themself.Now he have " + magic); 
	}
	System.out.print("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		King king1 = new King(100,100,"Artur");
		Dilly massive[] = new Dilly[5];
		massive[0] = new Hag(100,100,"Ana");
		massive[1] = new Hag(100,100,"kate");
		massive[2] = new Hag(100,100,"Tania");
		massive[3] = new Hag(100,100,"Marta");
		massive[4] = new King(100,100,"Jony");
		for(Dilly d:massive){
			d.makeSomeBodyHurt(king1);
			}
		king1.cureThemself();
		king1.cureThemself();
			

	}

}
