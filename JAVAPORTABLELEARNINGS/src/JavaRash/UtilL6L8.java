package JavaRash;

public class UtilL6L8 {
	
public static double getDistance(int x1, int y1, int x2, int y2) {
    //напишите тут ваш код
    double a = Math.pow((x2-x1),2)+ Math.pow((y2-y1),2);
    return Math.sqrt(a); 
}

public static void main(String[] args) {
	System.out.println(getDistance(2,5,4,2));
}
}
