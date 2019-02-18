package JavaRushLev8;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
¬рем€ дл€ 10 тыс€ч вызовов get
*/

public class DateResult {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTimeMsOfGet(List list) {
        //напишите тут ваш код
        Date StartDate = new Date();
        long StartTime = StartDate.getTime();
        get10000(list);
        Date EndDate = new Date();
        long EndTime = EndDate.getTime();
        long CountMs = EndTime - StartTime;
        return CountMs;
        //напишите тут ваш код

    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}