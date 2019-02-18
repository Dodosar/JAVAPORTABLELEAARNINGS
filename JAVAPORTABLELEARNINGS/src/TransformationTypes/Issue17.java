package TransformationTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Поправочки нужны
*/

public class Issue17 {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Issue17() {
        this.map = new HashMap<Integer, String>();
        //map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        Issue17 solution = new Issue17();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i < 3; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }
        //solution.map.values().removeAll(Collections.singleton(null));

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
