package ��ü����3�����ǽ�;
import java.util.Scanner;

public class �ǽ�3���� {

	public static void main(String[] args) {
		System.out.println("�⵵�� ���� �Է����ּ���: ");
		Scanner myVar = new Scanner(System.in);
		int year = myVar.nextInt();
		int month = myVar.nextInt();
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0) {
				System.out.println(year+"�� 2���� 29���Դϴ�.");
			}
			else {
				System.out.println(year+"�� 2���� 28���Դϴ�.");
			}
		}
		else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
		System.out.println(year+"�� "+month+"���� 31���Դϴ�.");	
		}
		else {
			System.out.println(year+"�� "+month+"���� 30���Դϴ�.");
		}
	}

}
