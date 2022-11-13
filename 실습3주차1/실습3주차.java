package 객체지향3주차실습;
import java.util.Scanner;

public class 실습3주차 {

	public static void main(String[] args) {
		System.out.println("년도와 달을 입력해주세요: ");
		Scanner myVar = new Scanner(System.in);
		int year = myVar.nextInt();
		int month = myVar.nextInt();
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0) {
				System.out.println(year+"년 2월은 29일입니다.");
			}
			else {
				System.out.println(year+"년 2월은 28일입니다.");
			}
		}
		else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
		System.out.println(year+"년 "+month+"월은 31일입니다.");	
		}
		else {
			System.out.println(year+"년 "+month+"월은 30일입니다.");
		}
	}

}
