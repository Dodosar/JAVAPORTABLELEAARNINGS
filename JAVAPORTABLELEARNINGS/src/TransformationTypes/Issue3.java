package TransformationTypes;

public class Issue3 {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b =(int)(i + (byte)f);
        System.out.println(b);
        /*https://metanit.com/java/tutorial/2.2.php 
         * Пример по ссылке: int a = 200; byte b = (byte) a;
         *  Результатом будет число -56. 
         *  В данном случае число 200 вне диапазона для типа byte (от -128 до 127),
         *   поэтому произойдет усечение значения. Так как тип byte предполагает 256 возможных значений, 
         *   то полученное значение будет равно 200-256, то есть -56. 
         *   В нашем случае:
         *    int b = (int) (i + (byte)f);
         *     128-256= -128, а 128+(-128) = 0
         */
    }
}
