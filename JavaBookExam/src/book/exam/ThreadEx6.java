package book.exam;

import javax.swing.JOptionPane;

public class ThreadEx6 {
	
	public static void main(String[] args) throws Exception{
		
		String input = JOptionPane.showInputDialog("input any value ");
		System.out.println("input value :" + input);
		
		for(int i=10;i>0;i--){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		
	}
	
	
	
}//.class
