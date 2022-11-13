package 실습8주차;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

class Paint extends JFrame{
	public void paint(Graphics g) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();//n각형인지 입력받는다.
		int r = 100;//반지름
		Polygon p = new Polygon();
		p.addPoint(210, 110);
		g.drawOval(10,10,200,200);//원을 그린다
		g.drawString("(radius: 100)", 210, 220);
		if(n%2==0) {//n이 짝수인 경우
			
			for(int i=0;i<n/2;i++) {
				p.addPoint(x, y);//밑점(210,110)을 기준으로 좌우로 점을 찍어서 그림을 완성시킨다
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
				p.addPoint(x, y);//밑점(210,110)을 기준으로 좌우로 점을 찍어서 그림을 완성시킨다
				p.addPoint(x, y);//홀수인 경우 끝점으로 끝나지 않음
				g.drawString("angle:"+i+1, 209-i, 220);
			}
			for(int j=0;j<n;j++) {
				g.drawString("angle:"+j+1, 209-j, 220);
			}
			g.drawPolygon(p);
		}
	}
	
}

public class 실습8주차 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		final int FRAME_WIDTH = 800;
		final int FRAME_HEIGHT = 600;
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("실습8주차");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("input number of angle:");
		
		Paint paint = new Paint();
		frame.add(paint);
		frame.setVisible(true);
		
			
	}

}
