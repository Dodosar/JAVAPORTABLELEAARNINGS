package Facade;
public class Facade {
	public static void main(String[] args) {
		/*Power power = new Power();
		power.on();		
		DVDRom dvd = new DVDRom();
		dvd.load();		
		HDD hdd = new HDD();
		hdd.copeFromDVD(dvd);*/		
		Computer computer = new Computer();
		computer.copy();	}
}
///This is FASADE class
class Computer{
	Power power = new Power();
	DVDRom dvd = new DVDRom();
	HDD hdd = new HDD();		
	void copy() {
		power.on();
		dvd.load();
		hdd.copeFromDVD(dvd);
	}
}
class Power{
	void on() {
		System.out.println("Click on power");
	}	
	void off() {
		System.out.println("Click off power");
	}
}
class DVDRom{
	private boolean data = false;
	public boolean hasData() {
		return data;
	}	
	void load() {
		data = true;
	}	
	void unload() {
		data = false;
	}
}
class HDD{
	void copeFromDVD(DVDRom dvd) {
		if(dvd.hasData()) {
			System.out.println("Copying data from disk");
		}
		else {
			System.out.println("Put in dusk with data");
		}
	}
}
