package Instanceof;

import java.util.ArrayList;
import java.util.List;

/* 
����������� �����
*/

public class CliningCenter {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new Apt1Room());
        apartments.add(new Apt2Room());
        apartments.add(new Apt3Room());
        apartments.add(new Apt1Room());
        

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        //�������� ��� ���� ���������� ������� 1-4
    	for(Apartment i : apartments){
    		String ClassName = i.getClass().getSimpleName();
    		if(i instanceof Apt1Room){
    			((Apt1Room)i).clean1Room();
    		}
    		else if(i instanceof Apt2Room){
    			((Apt2Room)i).clean2Rooms();
    		}
    		else if(i instanceof Apt3Room){
    			((Apt3Room)i).clean3Rooms();
    		}    		
    	}
    }

    static interface Apartment {
    }

    static class Apt1Room implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class Apt2Room implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class Apt3Room implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}