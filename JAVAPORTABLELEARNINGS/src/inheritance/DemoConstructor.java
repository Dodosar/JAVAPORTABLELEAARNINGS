package inheritance;

class DemoConstructor{
	      int  value1;
	      int  value2;
	      DemoConstructor(){
	       value1 = 10;
	       value2 = 20;
	       System.out.println("Inside 1st Constructor");
	     }
	      DemoConstructor(int a){
	      value1 = a;
	      System.out.println("Inside 2nd Constructor");
	    }
	      DemoConstructor(int a,int b){
	    value1 = a;
	    value2 = b;
	    System.out.println("Inside 3rd Constructor");
	   }
	   public void display(){
	      System.out.println("Value1 === "+value1);
	      System.out.println("Value2 === "+value2);
	  }
	  public static void main(String args[]){
		  DemoConstructor d1 = new DemoConstructor();
		  DemoConstructor d2 = new DemoConstructor(30);
		  DemoConstructor d3 = new DemoConstructor(30,40);
	    d1.display();
	    d2.display();
	    d3.display();
	 }
	}