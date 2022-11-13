package 실습4주차;
import java.util.Scanner;

public class 실습4주차1 {

	public static void main(String[] args) {
		Calculator Cal;
		Cal = new Calculator();
		int a, b;
		System.out.println("숫자를 입력하세요: ");
		Scanner myVar=new Scanner(System.in);
		a= myVar.nextInt();
		b= myVar.nextInt();
		Cal.plus(a,b);
		Cal.minus(a,b);
		Cal.multiply(a,b);
		Cal.divide(a,b);
		Cal.mod(a,b);
	}

}
class Calculator{
	
	public void plus(int a, int b) {
		int sum = a+b;
		System.out.println(a+" + "+b+" = "+sum);
	}
	public void minus(int a, int b) {
		int sub=a-b;
		System.out.println(a+" - "+b+" = "+sub);
	}
	public void multiply(int a, int b) {
		int mul =a*b;
		System.out.println(a+" * "+b+" = "+mul);
	}
	public void divide(int a, int b) {
		int div=a/b;
		System.out.println(a+" / "+b+" = "+div);
	}
	public void mod(int a, int b) {
		int left=a%b;
		System.out.println(a+" % "+b+" = "+left);
	}
}