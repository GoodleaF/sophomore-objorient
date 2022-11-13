import java.util.Scanner;

public class 실습 {

	public static void main(String[] args) {
		System.out.println("계산할 년도를 입력하세요");
		Scanner myVar = new Scanner(System.in);
		int year = myVar.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println(year+"년은 윤년입니다.");
		}
		else{
			System.out.println(year+"년은 윤년이 아닙니다.");
			}
		}
}


