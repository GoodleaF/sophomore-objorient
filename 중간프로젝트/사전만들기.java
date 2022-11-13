package 중간프로젝트;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class 사전만들기 {
//크기가 한정되지 않은 배열에 단어, 품사, 뜻, 검색한 횟수를 저장하고 (새 단어를 넣을 때마다 index++ 후 4배-1 해서 배열을 정한다) 주어진 조건 실행
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;//명령어를 입력받는다
		String word;//검색할 단어
		int countall = 0;//전체 검색 횟수
		int index = 0;//총 단어의 갯수
		List countfind = new ArrayList();//각 단어가 몇번 검색되었는지 저장
		List dictionary = new ArrayList();//단어를 저장한다
		List partofword = new ArrayList();//품사를 저장한다
		List meaning = new ArrayList();//뜻을 저장한다
		System.out.println("Dictionary\n type input: or search: or word class: or end.");
		s = input.nextLine();
		while(s != "end.") {
			switch(s) {
			case "input:":
				System.out.println("input word, part and meaning");
				s = input.nextLine();//영어단어, 품사, 뜻을 한줄로 입력 받는다
				String[] inputwords = s.split(",");//,로 문자열을 잘라서 inputwords 배열에 넣는다				
				dictionary.add(index, inputwords[0]);//단어를 저장한다
				partofword.add(index, inputwords[1]);//품사를 저장한다
				meaning.add(index, inputwords[2]);//뜻을 저장한다
				countfind.add(index, 0);
				index++;
				System.out.println("type input: or search: or word class: or end.");
				s = input.nextLine();
				break;
				
			case "search:"://입력했던 단어를 입력하면 뜻과 단어를 검색한 횟수를 보여준다	
				System.out.println("input word to find");
				word = input.nextLine();
				for(int i=0; i<index;i++) {
					if(word.equals(dictionary.get(i))) {
						System.out.println(meaning.get(i)+"\n");
						
						int n = Integer.parseInt(countfind.get(i).toString());
						n++;
						countfind.add(i,n);
						System.out.println("검색 횟수 : "+countfind.get(i)+"\n");
					}
				}
				countall++;
				System.out.println("type input: or search: or word class: or end.");
				s = input.nextLine();
				break;
				
			case "word class:":
				System.out.println("input part of word to find: ");
				s = input.nextLine();//찾을 품사를 입력받는다.
				String[] Arr = new String[index];
				for(int i=0;i<index;i++) {//배열 Arr에 입력받은 품사에 해당하는 단어들을 넣는다 
					if(s.equals(partofword.get(i))) {
						Arr[i] = (String) dictionary.get(i);
					}
				}
				Arrays.sort(Arr);//Arr을 오름차순으로 정렬한다
				if(Arr.length >= 4) {
					for(int i=0;i<5;i++) {//Arr[0]~Arr[4]까지 출력한다
						System.out.println(Arr[i]+"\n");
					}
				}
				else {//입력된 단어가 5개 이하일 경우
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
