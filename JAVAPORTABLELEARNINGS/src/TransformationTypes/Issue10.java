package TransformationTypes;

public class Issue10 {
    public static void main(String[] args) {
        String s = "� �� ���� ������� Java, � ���� ������� ��������";

        //�������� ��� ��� ���
        for(int i = 0; i < 40; i++){        	
        	System.out.println(s.valueOf(s.substring(i)));
        }
    }

}

