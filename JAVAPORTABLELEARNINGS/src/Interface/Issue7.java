package Interface;

public class Issue7 {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject {
        SimpleObject getInstance();
    }

    class StringObject implements SimpleObject
    {
    private String a;
	@Override
	public  SimpleObject getInstance(){
		return this;
	}
    }

}