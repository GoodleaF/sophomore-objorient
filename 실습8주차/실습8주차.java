package �ǽ�8����;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

class Paint extends JFrame{
	public void paint(Graphics g) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();//n�������� �Է¹޴´�.
		int r = 100;//������
		Polygon p = new Polygon();
		p.addPoint(210, 110);
		g.drawOval(10,10,200,200);//���� �׸���
		g.drawString("(radius: 100)", 210, 220);
		if(n%2==0) {//n�� ¦���� ���
			
			for(int i=0;i<n/2;i++) {
				p.addPoint(x, y);//����(210,110)�� �������� �¿�� ���� �� �׸��� �ϼ���Ų��
				p.addPoint(x, y);
			}
			p.addPoint(210, 10);
			for(int j=0;j<n;j++) {
				g.drawString("angle:"+j+1, 209-j, 220);
			}
			g.drawPolygon(p);
		}
		else {
			for(int i=0;i<n/2;i++) {
				p.addPoint(x, y);//����(210,110)�� �������� �¿�� ���� �� �׸��� �ϼ���Ų��
				p.addPoint(x, y);//Ȧ���� ��� �������� ������ ����
				g.drawString("angle:"+i+1, 209-i, 220);
			}
			for(int j=0;j<n;j++) {
				g.drawString("angle:"+j+1, 209-j, 220);
			}
			g.drawPolygon(p);
		}
	}
	
}

public class �ǽ�8���� {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		final int FRAME_WIDTH = 800;
		final int FRAME_HEIGHT = 600;
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("�ǽ�8����");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("input number of angle:");
		
		Paint paint = new Paint();
		frame.add(paint);
		frame.setVisible(true);
		
			
	}

}
