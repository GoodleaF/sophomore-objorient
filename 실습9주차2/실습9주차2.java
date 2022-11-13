package 실습9주차2;
class Account{
	int balance=0;
	public void deposit(int i) {
		balance+=i;
	}

	public int getBalance() {
		return balance;
	}

	public void withdraw(int i) throws BalanceInsufficientException {
		balance-=i;
		if(balance<0) {
			BalanceInsufficientException ext = new BalanceInsufficientException(-balance);
			throw ext;
		}
	}
	
}
class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException(int i) {
		super("잔고 부족: "+ i + " 모자람");
	}
}
public class 실습9주차2 {

	public static void main(String[] args) throws BalanceInsufficientException {
		// TODO Auto-generated method stub
		Account act = new Account();
		
		act.deposit(25000);
		System.out.println("예금액: "+act.getBalance());
		
		try {
			act.withdraw(50000);
		}
		catch(BalanceInsufficientException e) {
			String msg = e.getMessage();
			System.out.println(msg);
			System.out.println();
			
			e.printStackTrace();
		}
	}
}
