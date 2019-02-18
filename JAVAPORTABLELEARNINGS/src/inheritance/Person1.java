package inheritance;
 
public abstract class Person1 {
     
    private String name;
    private String surname;
      
    public String getName() { return name; }
    public String getSurname() { return surname; }
    
    public Person1(String name, String surname){
     
        this.name=name;
        this.surname=surname;
    }
  
    public abstract void displayInfo();
}
 
class Employee extends Person1{
 
    private String bank;
     
    public Employee(String name, String surname, String company) {
     
        super(name, surname);
        this.bank=company;
    }
     
    public void displayInfo(){
         
        System.out.println("Имя: " + super.getName() + " Фамилия: "
                + super.getSurname() + " Работает в банке: " + bank);
    }
}
 
class Client extends Person1
{
    private String bank;
     
    public Client(String name, String surname, String company) {
     
        super(name, surname);
        this.bank=company;
    }
     
    public void displayInfo(){
         
        System.out.println("Имя: " + super.getName() + " Фамилия: "
                + super.getSurname() + " Клиент банка: " + bank);
    }
}