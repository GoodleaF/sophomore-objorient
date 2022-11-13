package 실습3주차2;
import java.util.Scanner;

public class 실습3주차2 {
	public static void main(String[] args){
		System.out.println("입력받을 단수를 입력해주세요: ");
		Scanner myVar = new Scanner(System.in);
		int num = myVar.nextInt();
		for(int i =1;i<10;i++){
			System.out.println(i+" * "+num+" = "+i*num);
		}
	}

}
