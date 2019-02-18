package Interface;

public class Note {
	
	private String a;

	public Note(String string) {
		// TODO Auto-generated constructor stub
		this.a = string;
	}
	
	public String toString() { return this.a; }

	public static Note MIDDLE_C = new Note("MIDDLE_C");


}
