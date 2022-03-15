package controller;

public class Exec1 extends Thread{

	
		private int x;
		
		public Exec1(int x) {
			
			this.x = x;
		}
		
		@Override
		public void run() {
		print();
		
		}
		
		private void print() {
			System.out.println("Thread ==> " + x);
			
		}
}