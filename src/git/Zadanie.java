package git;

public class Zadanie {

	String text = new String();
	
	
	public Zadanie(String text) {
		this.text = text;
	}
	
	public void edit(String n) {
		text = n;
	}
	
	public void show() {
		System.out.println(text);
	}
}

