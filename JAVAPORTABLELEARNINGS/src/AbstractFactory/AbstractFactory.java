package AbstractFactory;

import java.util.Scanner;

public class AbstractFactory {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Language");

	    String lang = myObj.nextLine().toUpperCase();  // Read user input
	    System.out.println("Language is: " + lang);  // Output user input
		
		
		DeviceFactory factory = getFactoryByCountry(lang);
		Mouse m = factory.getMouse();
		Keyboard k = factory.getKeyboard();
		Touchpad t = factory.getTouchpad();
		
		m.click();
		k.print();
		k.println();
		t.track(10, 35);
		
	}
	
	private static DeviceFactory getFactoryByCountry(String lang) {
		switch(lang) {
		case "RU":
			return new RuDeviceFactory();
		case "EN":
			return new EnDeviceFactory();
		default:
			throw new RuntimeException("Unsupported Country Code: " + lang);
		}
	}
}

 


interface Mouse{
	void click();
	void dbclick();
	void scroll(int directory);
}

interface Keyboard{
	void print();
	void println();
}

interface Touchpad{
	void track(int deltaX, int deltaY);
}

interface DeviceFactory{
	Mouse getMouse();
	Keyboard getKeyboard();
	Touchpad getTouchpad();
}

class RuMouse implements Mouse {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Щелчок мышью");
	}

	@Override
	public void dbclick() {
		// TODO Auto-generated method stub
		System.out.println("Двойной щелчок мышью");
	}

	
	@Override
	public void scroll(int directory) {
		// TODO Auto-generated method stub
		if(directory > 0) {
			System.out.println("Скроллим верх");
		}
		else if(directory < 0) {
			System.out.println("Скроллим вниз");
		}
		else {
			System.out.println("не скроллим");
		}
	}
}

class RuKeyboard implements Keyboard {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Печатаем строку");
	}

	@Override
	public void println() {
		// TODO Auto-generated method stub
		System.out.println("Печатаем строку с переводом строки");
	}	
}

class RuTouchpad implements Touchpad{

	@Override
	public void track(int deltaX, int deltaY) {
		// TODO Auto-generated method stub
		int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY,2));
		System.out.println("Передвинулись на " + s + " пикселей");
	}
	
}


class EnMouse implements Mouse {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Click");
	}

	@Override
	public void dbclick() {
		// TODO Auto-generated method stub
		System.out.println("Double Click");
	}

	
	@Override
	public void scroll(int directory) {
		// TODO Auto-generated method stub
		if(directory > 0) {
			System.out.println("Scroll up");
		}
		else if(directory < 0) {
			System.out.println("Scroll down");
		}
		else {
			System.out.println("No scrolling");
		}
	}
}

class EnKeyboard implements Keyboard {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print");
	}

	@Override
	public void println() {
		// TODO Auto-generated method stub
		System.out.println("Print line");
	}	
}

class EnTouchpad implements Touchpad{

	@Override
	public void track(int deltaX, int deltaY) {
		// TODO Auto-generated method stub
		int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY,2));
		System.out.println("Moved " + s + " pixels");
	}	
}

class EnDeviceFactory implements DeviceFactory{

	@Override
	public Mouse getMouse() {
		// TODO Auto-generated method stub
		return new EnMouse();
	}

	@Override
	public Keyboard getKeyboard() {
		// TODO Auto-generated method stub
		return new EnKeyboard();
	}

	@Override
	public Touchpad getTouchpad() {
		// TODO Auto-generated method stub
		return new EnTouchpad();
	}
	
}


class RuDeviceFactory implements DeviceFactory{

	@Override
	public Mouse getMouse() {
		// TODO Auto-generated method stub
		return new RuMouse();
	}

	@Override
	public Keyboard getKeyboard() {
		// TODO Auto-generated method stub
		return new RuKeyboard();
	}

	@Override
	public Touchpad getTouchpad() {
		// TODO Auto-generated method stub
		return new RuTouchpad();
	}
	
}

