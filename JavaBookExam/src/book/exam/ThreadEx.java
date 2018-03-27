package book.exam;

public class ThreadEx {
	
	public static void main(String[] args)  {
		
//		ThreadEx1_1 t1 = new ThreadEx1_1();
//		Runnable r = new ThreadEx1_2();
//		Thread t2 = new Thread(r);
		
//		t1.setName("kimThread");
//		t2.setName("ykThread");

//		t1.start();
//		t2.start();
//		
//		for (int i = 0; i < 100; i++) {
//			System.out.println("main Thread");
//		}
		ThreadEx5_1 th = new ThreadEx5_1();
		th.start();
		ThreadEx5_1 th2 = new ThreadEx5_1();
		th2.start();
		ThreadEx5_1 th3 = new ThreadEx5_1();
		th3.start();
		
		long startTime = System.currentTimeMillis();
//		System.out.println("Main Thread Start Time Millis   : " + startTime );
		for (int i = 0; i < 500 ; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("\nMain THread take Time 1 :  " + (System.currentTimeMillis()-startTime));
		
		
		
		
		
		
		
	}//.main

}//.class
