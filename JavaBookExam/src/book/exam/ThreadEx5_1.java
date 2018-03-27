package book.exam;

public class ThreadEx5_1 extends Thread{

	@Override
	public void run() {
		//System.out.println(getName() + " Thread Start Time Millis : " + System.currentTimeMillis());
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 500 ; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println("\n"+getName()+" THread take Time 2 :  " + (System.currentTimeMillis()-startTime));
		System.out.println();
	}

}//.class
