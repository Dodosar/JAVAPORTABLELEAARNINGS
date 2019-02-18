package inheritance;

interface Pet{
  public void test();
}
interface Animals{
 public void test();
  
}
class Dog implements Pet,Animals{
   public void test(){
     System.out.println("Interface Method Implemented");
  }
   
   public static void main(String args[]){
     Pet p = new Dog();
     Animals c = new Dog();
     p.test();
     c.test();
   }
}