package 실습5주차1;
import java.util.Scanner;

abstract class Calculator {
	public abstract int plus(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract int multiply(int a, int b);
	public abstract int divide(int a, int b);
	public abstract int mod(int a, int b);
}
class CalculatorAccess extends Calculator{
	
	public int plus(int a, int b){
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		if(b!=0) {
			return a/b;
		}
		else
			return 0;
	}
	public int mod(int a, int b) {
		return a%b;
	}
	
}
public class 실습5주차1 {
	

	public static void main(String[] args) {
		CalculatorAccess Cal = new CalculatorAccess();
		int a, b;
		System.out.println("숫자 두개를 입력하세요: ");
		Scanner myVar=new Scanner(System.in);
		a= myVar.nextInt();
		b= myVar.nextInt();
		int sum=Cal.plus(a, b);
		int sub=Cal.subtract(a, b);
		int mul=Cal.multiply(a, b);
		int div=Cal.divide(a, b);
		int mod=Cal.mod(a, b);
		System.out.println("a+b = "+sum);
		System.out.println("a-b = "+sub);
		System.out.println("a*b = "+mul);
		System.out.println("a/b = "+div);
		System.out.println("a%b = "+mod);
	}

}
