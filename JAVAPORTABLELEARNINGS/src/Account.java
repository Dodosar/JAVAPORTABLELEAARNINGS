class Account{
int a;
int b;

 public void setData(int a ,int b){
  this.a = a;
  this.b = b;
 }
 public void showData(){
   System.out.println("Value of A ="+a);
   System.out.println("Value of B ="+b);
 }
 public static void main(String args[]){
   Account obj = new Account();
   Account obj1 = new Account();
   obj.setData(2,3);
   obj1.setData(4,5);
   obj.showData();
   obj1.showData();
 }
}