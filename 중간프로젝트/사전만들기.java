package �߰�������Ʈ;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class ��������� {
//ũ�Ⱑ �������� ���� �迭�� �ܾ�, ǰ��, ��, �˻��� Ƚ���� �����ϰ� (�� �ܾ ���� ������ index++ �� 4��-1 �ؼ� �迭�� ���Ѵ�) �־��� ���� ����
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;//��ɾ �Է¹޴´�
		String word;//�˻��� �ܾ�
		int countall = 0;//��ü �˻� Ƚ��
		int index = 0;//�� �ܾ��� ����
		List countfind = new ArrayList();//�� �ܾ ��� �˻��Ǿ����� ����
		List dictionary = new ArrayList();//�ܾ �����Ѵ�
		List partofword = new ArrayList();//ǰ�縦 �����Ѵ�
		List meaning = new ArrayList();//���� �����Ѵ�
		System.out.println("Dictionary\n type input: or search: or word class: or end.");
		s = input.nextLine();
		while(s != "end.") {
			switch(s) {
			case "input:":
				System.out.println("input word, part and meaning");
				s = input.nextLine();//����ܾ�, ǰ��, ���� ���ٷ� �Է� �޴´�
				String[] inputwords = s.split(",");//,�� ���ڿ��� �߶� inputwords �迭�� �ִ´�				
				dictionary.add(index, inputwords[0]);//�ܾ �����Ѵ�
				partofword.add(index, inputwords[1]);//ǰ�縦 �����Ѵ�
				meaning.add(index, inputwords[2]);//���� �����Ѵ�
				countfind.add(index, 0);
				index++;
				System.out.println("type input: or search: or word class: or end.");
				s = input.nextLine();
				break;
				
			case "search:"://�Է��ߴ� �ܾ �Է��ϸ� ��� �ܾ �˻��� Ƚ���� �����ش�	
				System.out.println("input word to find");
				word = input.nextLine();
				for(int i=0; i<index;i++) {
					if(word.equals(dictionary.get(i))) {
						System.out.println(meaning.get(i)+"\n");
						
						int n = Integer.parseInt(countfind.get(i).toString());
						n++;
						countfind.add(i,n);
						System.out.println("�˻� Ƚ�� : "+countfind.get(i)+"\n");
					}
				}
				countall++;
				System.out.println("type input: or search: or word class: or end.");
				s = input.nextLine();
				break;
				
			case "word class:":
				System.out.println("input part of word to find: ");
				s = input.nextLine();//ã�� ǰ�縦 �Է¹޴´�.
				String[] Arr = new String[index];
				for(int i=0;i<index;i++) {//�迭 Arr�� �Է¹��� ǰ�翡 �ش��ϴ� �ܾ���� �ִ´� 
					if(s.equals(partofword.get(i))) {
						Arr[i] = (String) dictionary.get(i);
					}
				}
				Arrays.sort(Arr);//Arr�� ������������ �����Ѵ�
				if(Arr.length >= 4) {
					for(int i=0;i<5;i++) {//Arr[0]~Arr[4]���� ����Ѵ�
						System.out.println(Arr[i]+"\n");
					}
				}
				else {//�Էµ� �ܾ 5�� ������ ���
					for(int i=0;i<Arr.length;i++) {
						System.out.println(Arr[i]+"\n");
					}
				}
				System.out.println("type input: or search: or word class: or end.");
				s = input.nextLine();
				break;
				
			case "end.":
				s = "end.";
				if(countall==0) {
					for(int i=0;i<index;i++) {
						System.out.println(dictionary.get(i)+"0%\n");
					}
				}
				for(int i=0;i<index;i++) {
					System.out.println(dictionary.get(i)+" "+ (int)countfind.get(i)/countall*100+"%\n");
				}
				break;
				
			default :
				System.out.println("Wrong input. Type input: or search: or word class: or end.");
				s = input.nextLine();
				break;
			}
		}
		
		System.out.println("Closing Dictionary");
		
	}

}
