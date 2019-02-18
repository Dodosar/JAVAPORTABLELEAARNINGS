package Instanceof;

public class issue2 {
    public static void main(String[] args) {
    	TomCat cat = new TomCat();
    	cat.test1();
    	Cat cat2 = cat;
    	cat2.test2();;
    	    	
        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof Movable;
        boolean isTom = cat instanceof TomCat;
        Cat cat1 = (Cat) cat;
        cat1.test2();
        if (isCat && isMovable && isTom) System.out.println("Bingo!");
    }

    interface Movable {
    }

    static class Cat implements Movable {
    	public void test2(){
    		
    	}
    }

    static class TomCat extends Cat {
    	public void test1(){
    		
    	}
    }
}
