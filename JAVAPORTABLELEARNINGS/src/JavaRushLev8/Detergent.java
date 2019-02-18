package JavaRushLev8;

public class Detergent extends Cleanser {
	  // Изменяем метод:
	  public void scrub() {
	    append(" Detergent.scrub()");
	    super.scrub(); // Вызываем метод базового класса
	  }
	  // Добавляем новые методы к интерфейсу :
	  public void foam() { append(" foam()"); }
	  // Проверяем новый класс:
	  public static void main(String[] args) {
	    Detergent x = new Detergent();
	    x.dilute();
	    x.apply();
	    x.scrub();
	    x.foam();
	    System.out.println(x);
	    System.out.println("Testing base class:");
	    Cleanser.main(args);
	  }	
	}