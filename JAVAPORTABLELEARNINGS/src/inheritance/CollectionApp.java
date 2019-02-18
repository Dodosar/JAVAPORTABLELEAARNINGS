package inheritance;

import java.util.*;

public class CollectionApp {
 
    public static void main(String[] args) {
         
       TreeMap<Integer, String> states = new TreeMap<Integer, String>();
       states.put(10, "��������");
       states.put(2, "�������");
       states.put(14, "�������");
       states.put(3, "������");
        
       // ������� ������ �� ����� 2
       String first = states.get(2);
       // ������� ���������
       for(Map.Entry<Integer, String> item : states.entrySet()){
        
           System.out.printf("����: %d  ��������: %s \n", item.getKey(), item.getValue());
       }
       // ������� ���� ����� ������
       Set<Integer> keys = states.keySet();
       
       System.out.println(keys);
       
       // �������� ����� ���� ��������
       Collection<String> values = states.values();
        
       // �������� ��� �������, ������� ����� ����� ������� � ������ 4
       Map<Integer, String> afterMap = states.tailMap(4);
        
       // �������� ��� �������, ������� ����� �� ������� � ������ 10
       Map<Integer, String> beforeMap = states.headMap(10);
        
       // ������� ��������� ������� ������
       Map.Entry<Integer, String> lastItem = states.lastEntry();
        
       System.out.printf("��������� ������� ����� ���� %d �������� %s \n",lastItem.getKey(), lastItem.getValue());
         
       Map<String, Person> people = new TreeMap<String, Person>();
       people.put("1240i54", new Person("Tom"));
       people.put("1564i55", new Person("Bill"));
       people.put("4540i56", new Person("Nick"));
        
       for(Map.Entry<String, Person> item : people.entrySet()){
        
           System.out.printf("����: %s  ��������: %s \n", item.getKey(), item.getValue().getName());
       }
    }
}

class Person{
     
    private String name;
    public Person(String value){
         
        name=value;
    }
    String getName(){return name;}
}