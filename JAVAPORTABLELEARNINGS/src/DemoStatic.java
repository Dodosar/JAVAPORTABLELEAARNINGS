public class DemoStatic{
   public static void main(String args[]){
     Student s1 = new Student();
     s1.showData();
     s1.countC();
     Student s2 = new Student();
     s2.showData();
     s2.countC();
     Student.b++;
     s1.showData();
     s1.countC();
       }
}

class Student {
int a; //initialized to zero
static int b; //initialized to zero only when class is loaded not for each object created.
	//statci block
	static void countC(){
		int c = b * 2;
		System.out.println("Value of c = "+c);
	}
  
	Student(){
   //Constructor incrementing static variable b
   b++;
  }

   public void showData(){
      System.out.println("Value of a = "+a);
      System.out.println("Value of b = "+b);
      
   }
//public static void increment(){
//a++;
//}

}