package ModificatorToAcess;

import java.util.ArrayList;
import java.util.List;

/* 
��� - ������� ������ � ������������
*/

public class TofixBugsInInheritance {
    public static interface Alive {
    	Object containsBones();
    }

    public static class BodyPart implements Alive {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }

        public Object containsBones() {
            return "Yes";
        }

        public String toString() {
            return containsBones() == "Yes" ? name + " �������� �����" : name + " �� �������� �����";
        }
    }

    public static class Finger extends BodyPart {
        private boolean isArtificial;

        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }

        public Object containsBones() {
        	String result;
        	if(isArtificial == false && super.containsBones() == "Yes"){
        		result = "Yes";        	}
        	else{
        		result = "No";
        	}
        	
            return result;
        }
    }

    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnAlives();
    }

    private static void printlnAlives() {
        System.out.println(new BodyPart("����").containsBones());
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("����"));
        bodyParts.add(new BodyPart("����"));
        bodyParts.add(new BodyPart("������"));
        bodyParts.add(new BodyPart("����"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("�������", true));
        fingers.add(new Finger("������������", true));
        fingers.add(new Finger("�������", true));
        fingers.add(new Finger("����������", false));
        fingers.add(new Finger("�������", true));
        System.out.println(fingers.toString());
    }
}
