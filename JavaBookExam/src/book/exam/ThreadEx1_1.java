package book.exam;

public class ThreadEx1_1  extends Thread{
	
	public void run(){
		for(int i = 0 ; i < 100 ; i++){
			System.out.println(getName());
		}
	}//.run
	
}//.class
