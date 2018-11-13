package git;

import java.util.Date;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		System.out.println("New branch here");
		System.out.println("Do usuniecia");
		
		Zadanie zadanie = new Zadanie("Zadanko");
		zadanie.show();
		zadanie.setComplete();
		zadanie.edit("zadanko1");
		
	}

}
