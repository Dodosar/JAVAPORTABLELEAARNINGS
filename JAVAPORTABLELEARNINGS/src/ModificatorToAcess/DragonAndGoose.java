package ModificatorToAcess;

public class DragonAndGoose {
    //�������� ������ Goose � Dragon ���
    public class Goose extends SmallAnimal{
        @Override
        public String getSize(){
        	System.out.println("���� ���������, " + super.getSize());
            return "���� ���������, " + getSize();
        }
    }
    
    public class Dragon extends BigAnimal{
        @Override
        public String getSize(){
            return "������ �������, " + getSize();
        }
    }

    public static void main(String[] args) {
    	SmallAnimal gooses = new SmallAnimal();
    	gooses.getSize();
    }

    public static class BigAnimal {
        protected String getSize() {
            return "��� ��������";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "��� �����";
        }
    }
}
