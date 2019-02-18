package Patterns;

/*
 *created by Dima Tiurin Jan 9, 2019
 */

public class Delegate {
	public static void main(String[] args){
		
		A a = new A();
		a.f();
		
		Painter painter = new Painter();
		painter.setGraphics(new Square());
		painter.draw();
		
		painter.setGraphics(new Triangle());
		painter.draw();
	}
}


class A {
	void f(){
		System.out.println("f()");
		/*
		 * 
		 */
	}
}

/* class B delegate to A all work
 * class B use class A*/

class B{
	A a = new A();
	void f(){
		a.f();
	}
}

interface Graphics{
	void draw();
}

class Triangle implements Graphics{
	public void draw() {
		System.out.println("Draw triangle");
			}
	}

class Square implements Graphics{
	public void draw() {
		System.out.println("Draw Square");
			}
	}

class Circle implements Graphics{
	public void draw() {
		System.out.println("Draw Circle");
			}
	}


class Painter{
	Graphics graphics;
	void setGraphics(Graphics g){
		graphics = g;		
	}
	
	void draw(){
		graphics.draw();
		}	
}
