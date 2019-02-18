package TransformationTypes;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Массив списков строк
*/

public class Issue14 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayOfStringList = new ArrayList[3] ;
		for(int i = 0; i <3; i++){
			arrayOfStringList[i] = new ArrayList<String>();
			arrayOfStringList[i].add("Test"+i);
		}
		Collections.addAll(arrayOfStringList[0],"fgfg");
        Collections.addAll(arrayOfStringList[1],"fgfgere");
        Collections.addAll(arrayOfStringList[2],"fgftrztg");
        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}