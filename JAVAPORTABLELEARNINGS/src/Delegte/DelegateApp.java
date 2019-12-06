package Delegte;

public class DelegateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	A a = new A();
//		a.f();		
//		B b = new B();
//		b.f();		
		Painter painter = new Painter();
		painter.setGraphics(new Square());
		painter.draw();
		
		painter.setGraphics(new Circle());
		painter.draw();
		
		painter.setGraphics(new Trianle());
		painter.draw();		
	}	
}
/*class A{
	void f() {
		System.out.println("f()");
	}
}

class B{
	A a = new A();
	void f() {
		a.f();
	}
	
	///Класс В делегирует работу классу А
}*/

interface Graphics{
	void draw();
}
class Trianle implements Graphics {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw triangle");
	}	
}
class Square implements Graphics {
	public void draw() {
		System.out.println("Draw Square");
	}
}
class Circle implements Graphics {
	public void draw() {
		System.out.println("Draw Circle");
			}
}
class Painter {
	Graphics graphics;
	void setGraphics(Graphics g) {
		graphics = g;
	}
		void draw() {
		graphics.draw();
		gh.draw();
	}	
	Graphics gh = new Trianle();	
}
