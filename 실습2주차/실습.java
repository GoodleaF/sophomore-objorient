import java.util.Scanner;

public class �ǽ� {

	public static void main(String[] args) {
		System.out.println("����� �⵵�� �Է��ϼ���");
		Scanner myVar = new Scanner(System.in);
		int year = myVar.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println(year+"���� �����Դϴ�.");
		}
		else{
			System.out.println(year+"���� ������ �ƴմϴ�.");
			}
		}
}


