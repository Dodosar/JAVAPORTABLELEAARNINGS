package Polimorphism;

public class Issue9 {

    public static void main(String[] args) {
        CTO cto = new CTO();
        cto.workHard();
        System.out.println(cto);
    }

    public static interface Businessman { 
    	public void workHard();
    	}
    public static class primogenitor implements Businessman {
    	public void workHard(){}
    	}
    public static class CTO extends primogenitor implements Businessman {
    	
    }
}

