package ModificatorToAcess;

public class DragonAndGoose {
    //добавьте классы Goose и Dragon тут
    public class Goose extends SmallAnimal{
        @Override
        public String getSize(){
        	System.out.println("Гусь маленький, " + super.getSize());
            return "Гусь маленький, " + getSize();
        }
    }
    
    public class Dragon extends BigAnimal{
        @Override
        public String getSize(){
            return "Дракон большой, " + getSize();
        }
    }

    public static void main(String[] args) {
    	SmallAnimal gooses = new SmallAnimal();
    	gooses.getSize();
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}
