package ��ü�ǽ�12����;

public class ��ü�ǽ�12����2 {

	public static void main(String[] args) {
		K kp= new K();
		K kp2 = new K();
		kp.start();
		kp2.start();
	}
}
	class K extends Thread{
		private int x = 100;
		public synchronized void setX(int x) {//�ϳ��� �����忡�� x�� ���� ���� �� �ٸ� �����忡���� ������ ���´�
			this.x+=x;
		}
		
		public synchronized int getX() {
			return x;
		}
		
		public void run() {
			synchronized (this) {//����ȭ ���. �� �κи��� ����ȭ�Ѵ�.
				setX(200);
				
				System.out.println("x = "+getX());
			}
		}
	}

