package TransformationTypes;

public class Issue3 {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b =(int)(i + (byte)f);
        System.out.println(b);
        /*https://metanit.com/java/tutorial/2.2.php 
         * ������ �� ������: int a = 200; byte b = (byte) a;
         *  ����������� ����� ����� -56. 
         *  � ������ ������ ����� 200 ��� ��������� ��� ���� byte (�� -128 �� 127),
         *   ������� ���������� �������� ��������. ��� ��� ��� byte ������������ 256 ��������� ��������, 
         *   �� ���������� �������� ����� ����� 200-256, �� ���� -56. 
         *   � ����� ������:
         *    int b = (int) (i + (byte)f);
         *     128-256= -128, � 128+(-128) = 0
         */
    }
}
