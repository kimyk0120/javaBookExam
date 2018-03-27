package book.exam;

import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args) {
//		System.out.println("ThreadEx7");
		ThreadEx7_1 th1 = new ThreadEx7_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("anu val ");
		System.out.println("input :" + input);
	}
	
}//.class


class ThreadEx7_1 extends Thread{

	@Override
	public void run() {
		
		for(int i=10;i>0;i--){
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
		
	}
	
}
