package 실습3주차3;
import java.util.Scanner;
import java.lang.Math;

public class 실습3주차3 {

	public static void main(String[] args) {
		System.out.println("삼각형의 양변의 길이를 입력하세요(a, b): ");
		Scanner myVar = new Scanner(System.in);
		int a = myVar.nextInt();
		int b = myVar.nextInt();
		System.out.println("a와 b 사이의 각도의 크기를 입력하세요: ");
		int ang = myVar.nextInt();
		double rad = ang*Math.PI/180;
		double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(rad)); 
		System.out.println("\n나머지 한 변 c의 크기는 "+c+"입니다.\n");
		System.out.println("변 c를 나누는 비율을 입력하세요(n, m)");
		double n = myVar.nextDouble();
		double m = myVar.nextDouble();
		double d = Math.sqrt((b*b*m+c*c*n)/a-m*n);
		System.out.println("\n중선 d의 크기는 "+d+"입니다.");

	}

	
}
