package statics;

import java.util.HashMap;
import java.util.Map;


public class Issue1 {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }
    
    static
    {
    	labels.put(10.0, "Test1");
    	labels.put(11.0, "Test2");
    	labels.put(12.0, "Test3");
    	labels.put(13.0, "Test4");
    	labels.put(14.0, "Test5");
    }
}

