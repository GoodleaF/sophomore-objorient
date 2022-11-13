package 실습12주차1;

public class 실습12주차1 {

	public static void main(String[] args) {
		Runnable r = new A();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}
	class Account{
		int balance=1000;
		public void withdraw(int money) {
			if(balance>=money) {
				try {Thread.sleep(1000);} catch(Exception e) {}
				balance -= money;
			}
		}
	}
	
	class A implements Runnable{
		Account acc = new Account();
		
		public void run() {
			while(acc.balance>0) {
				int money = (int) (Math.random()*3+1)*100;
				acc.withdraw(money);
				System.out.println("balance:"+acc.balance);
			}
		}
	}

