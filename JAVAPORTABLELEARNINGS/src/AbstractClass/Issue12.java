package AbstractClass;

public class Issue12 {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<String> {
        SimpleObject<String> getInstance();
    }
    
    public static class StringObject implements SimpleObject<String>{
    	
    	public SimpleObject<String> getInstance(){
    		return null;
    	}
    	
    }

}
