package book.exam;

public class ThreadEx {
	
	public static void main(String[] args)  {
		
		ThreadEx1_1 t1 = new ThreadEx1_1();
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		t1.setName("kimThread");
		t2.setName("ykThread");

		t1.start();
		t2.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main Thread");
		}
		
		
	}//.main

}//.class
