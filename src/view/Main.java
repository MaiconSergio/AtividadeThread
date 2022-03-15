package view;


import controller.Exec1;

public class Main {
	
	public static void main(String[] args) {
		
	for (int i=0; i<5; i++) {
		
		Thread t = new Exec1(i);
		t.start();
	}
		
	}
	
}