package git;

public class Zadanie {

	String text = new String();
	Boolean complete = false;
	
	public Zadanie(String text) {
		this.text = text;
	}
	
	public void edit(String n) {
		text = n;
	}
	
	public void setComplete() {
		complete = true;
	}
	
	public void show() {
		System.out.println(text);
	}
}

