package innerclass;

public class MultiImplementation {
	  static void takesD(D d) {}
	  static void takesE(E e) {}
	  public static void main(String[] args) {
	    Z z = new Z();
	    takesD(z);
	    takesE(z.makeE());
	  }
	}