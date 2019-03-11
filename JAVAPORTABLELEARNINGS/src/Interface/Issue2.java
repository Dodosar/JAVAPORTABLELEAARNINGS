package Interface;

public class Issue2 {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
        beer.newMethod();
    }

    public interface Drink {
        boolean isAlcoholic();
        
        default void newMethod(){  
            System.out.println("Newly added default method");  
        }  
    }    


    public static class AlcoholicBeer implements Drink{
    	@Override
    	public boolean isAlcoholic(){    	
    		return true;
    	}
    	
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }

    }
}