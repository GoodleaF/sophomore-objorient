package �ǽ�3����3;
import java.util.Scanner;
import java.lang.Math;

public class �ǽ�3����3 {

	public static void main(String[] args) {
		System.out.println("�ﰢ���� �纯�� ���̸� �Է��ϼ���(a, b): ");
		Scanner myVar = new Scanner(System.in);
		int a = myVar.nextInt();
		int b = myVar.nextInt();
		System.out.println("a�� b ������ ������ ũ�⸦ �Է��ϼ���: ");
		int ang = myVar.nextInt();
		double rad = ang*Math.PI/180;
		double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(rad)); 
		System.out.println("\n������ �� �� c�� ũ��� "+c+"�Դϴ�.\n");
		System.out.println("�� c�� ������ ������ �Է��ϼ���(n, m)");
		double n = myVar.nextDouble();
		double m = myVar.nextDouble();
		double d = Math.sqrt((b*b*m+c*c*n)/a-m*n);
		System.out.println("\n�߼� d�� ũ��� "+d+"�Դϴ�.");

	}

	
}
