public class Hag implements Dilly{

	int helth,magic;
	String name;
	
	Hag(int helth,int magic,String name){
		this.helth=helth;
		this.magic=magic;
		this.name=name;
	}
	
	public void makeSomeBodyHurt(King king) {
		if(magic>40){
			System.out.println("Hag " + name + " atack");
			magic=magic-30;
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
		System.out.println("Hag " + name + "treated");
	if(magic>70){
		magic=magic-70;
		helth=helth+30;
		System.out.println("Hag " + helth + " helth have now");
		System.out.println("Hag have " + magic + " now");
	}
	else{
		System.out.println("Hag dont have a lot of magic to treated themself.Now he have " + magic); 
	}
	System.out.print("");
	}
}
