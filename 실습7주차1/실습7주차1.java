package 실습7주차1;
import java.util.Scanner;

public class 실습7주차1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(">>");
		
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		StringBuffer sb = new StringBuffer(text);
		
		while(true) {
			System.out.print("명령: ");
			String command = scanner.nextLine();
			
			if(command.equals("stop")) {
				System.out.print("종료합니다");
				break;
			}
			
			String []tokens = command.split("!");
			
			if(tokens.length != 2) {
				System.out.println("잘못된 명령입니다");
			}
			else {
				if(tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("잘못된 명령입니다.");
					continue;
				}
				
				int index = sb.indexOf(tokens[0]);
				
				if(index == -1) {
					System.out.println("찾을 수 없습니다");
					continue;
				}
				sb.replace(index, index+tokens[0].length(), tokens[1]);
				System.out.println(sb.toString());
			}
		}
		
		scanner.close();
	}

}
