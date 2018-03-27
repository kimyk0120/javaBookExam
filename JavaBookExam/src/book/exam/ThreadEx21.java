package book.exam;

public class ThreadEx21 {
	public static void main(String[] args) {
		Runnable r = new RunnableEx21();
		new Thread(r).start();
		new Thread(r).start();
	}
}


class Acount{
	private int balance = 1000;
	
	public int getBalance(){
		return balance;
	}
	
	public synchronized void widthraw(int money){
		if(balance >= money){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			balance -= money;
		}
	}
}


class RunnableEx21 implements Runnable{
	Acount acc = new Acount();

	@Override
	public void run() {
		while(acc.getBalance() >0 ){
			int money = (int)(Math.random()*3+1)*100;
			System.out.println("widthraw money"+ money);
			acc.widthraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
		
	}
	
}