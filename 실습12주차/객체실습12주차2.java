package 객체실습12주차;

public class 객체실습12주차2 {

	public static void main(String[] args) {
		K kp= new K();
		K kp2 = new K();
		kp.start();
		kp2.start();
	}
}
	class K extends Thread{
		private int x = 100;
		public synchronized void setX(int x) {//하나의 쓰레드에서 x에 접근 중일 때 다른 쓰레드에서의 접근을 막는다
			this.x+=x;
		}
		
		public synchronized int getX() {
			return x;
		}
		
		public void run() {
			synchronized (this) {//동기화 블록. 이 부분만을 동기화한다.
				setX(200);
				
				System.out.println("x = "+getX());
			}
		}
	}

