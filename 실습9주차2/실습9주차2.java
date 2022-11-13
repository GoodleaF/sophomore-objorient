package �ǽ�9����2;
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
		super("�ܰ� ����: "+ i + " ���ڶ�");
	}
}
public class �ǽ�9����2 {

	public static void main(String[] args) throws BalanceInsufficientException {
		// TODO Auto-generated method stub
		Account act = new Account();
		
		act.deposit(25000);
		System.out.println("���ݾ�: "+act.getBalance());
		
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
