package JavaRushLevel6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class sortirovkaBubble {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        
        int[] mas = {a,b,c,d,e};
        
        int j;
        int temp;
        //boolean flag = true; //переменная, которая отвечает за упорядоченность эелемнтов в массиве
        
       /* while(flag){ //входим в while цикл
        	flag =false; // назначаем swapped на false
        	for(j = 0; j < mas.length - 1; j++ ){ // входим в цикл for
        		if(mas[j]>mas[j+1]){
        		// например: если элемент под индексом i=1, т.е. 11, больше элемента
                // под индексом i=2, т.е. 4, то меняем их местами
                // 
        			temp = mas[j];
        			mas[j] = mas[j+1];
        			mas[j+1] = temp;
        			flag = true; // true означает, что замена местами была проведена
                }
        		}
        	}
        }*/
        
        for(int i = 0; i < mas.length-1; i++){
        	System.out.println("this i" +i);
            for(j = i+1; j < mas.length; j++) {
            	System.out.println("this j" +j);
              if(mas[j] > mas[i]) { // Если требуемый порядок следования не соблюдается
                                          // элементы меняются местами
            	temp = mas[j];
                mas[j] = mas[i];
                mas[i] = temp;

            }
          }

        }
        for(int i = 0; i<mas.length; i++){
        	System.out.println(mas[i]);
        }
        
        
        
        
        
    }
}
