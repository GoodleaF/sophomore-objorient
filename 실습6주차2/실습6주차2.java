package �ǽ�6����2;
import java.util.Scanner;
import java.util.Arrays;

class times{
	int times(int x) {
		int temp=1;
		if(x==0) {
			return 1;
		}
		else {
			for(int i=0;i<x;i++) {
				temp *= 10;
			}
			return temp;
		}
	}
}

public class �ǽ�6����2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=0;
		int arr[]= new int[4];
		int arrup[]= new int[4];
		int arrdw[]= new int[4];
		int temp1=0;
		int temp2=0;
		int res=0;
		times t= new times(); 
		System.out.println("input num: ");
		num=input.nextInt();//a*1000+b*100+c*10+d�Է�
		System.out.println("result > ");
		for(int i=3;i>=0;i--) {//arr[0~3]�� ���� a, b, c, d
			arr[(3-i)]=num/t.times(i);
			num=num-arr[(3-i)]*t.times(i);
		}
		
		if(arr[0]==0) {//4�ڸ� ���� �ƴҶ�
			System.out.println("error: input is not 4 digits.");			
		}
		else if(arr[0]==arr[1]&&arr[0]==arr[2]&&arr[0]==arr[3]) {
			System.out.println("error: input have same each 4 digits.");
		}//��� ���� ���� ��
		
		else {//abcd�� ��������, ������������ ������ �� ����			
			for(int i=0;i<7;i++) {				
				Arrays.sort(arr);
				for(int j=0;j<4;j++) {
					arrup[j]=arr[j];//abcd�� ������������ �����Ѵ�					
					arrdw[j]=arr[3-j];//abcd�� ������������ ����					
				}								
				for(int j=0;j<4;j++) {
					temp1 += arrdw[j] * t.times(3-j);
					temp2 += arrup[j] * t.times(3-j);
				}				
				res = temp1 - temp2;
				System.out.println(temp1 + " - " + temp2 + "  = " + res);
				
				if(res==6174) 
					break;				
				
				else {					
					for(int j = 0; j < 4; j++) {
						arr[j]= res / t.times(3-j);
						res = res - arr[j] * t.times(3-j);	
						temp1=0;
						temp2=0;
					}
				}
			}
			
		}
	}
	

}