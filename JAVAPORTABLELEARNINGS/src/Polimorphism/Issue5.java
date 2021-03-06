package Polimorphism;

public class Issue5 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    /*
     * // ����� ������� �������� �� �������� ������ ������������ � �������.
     *  // ���� � ��� ����������� �� ����, ��� � ��� � ������� ����������� �� ���������. 
     */
    public static String getObjectType(Object o) {
        //�������� ��� ��� ���
    	if(o instanceof Tiger){
    		return "����";
    	}

    	else if(o instanceof Lion){
    		return "���";
    	}
    	else if(o instanceof Cat){
    		return "���";
    	}  	
    	
    	else if(o instanceof Bull){
    		return "���";
    	}
    	else if(o instanceof Cow){
    		return "������";
    	}
        return "��������";
    }

    public static class Cat extends Animal   //<--������ �����������!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}