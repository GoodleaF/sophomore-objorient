package �ǽ�7����1;
import java.util.Scanner;

public class �ǽ�7����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(">>");
		
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		StringBuffer sb = new StringBuffer(text);
		
		while(true) {
			System.out.print("���: ");
			String command = scanner.nextLine();
			
			if(command.equals("stop")) {
				System.out.print("�����մϴ�");
				break;
			}
			
			String []tokens = command.split("!");
			
			if(tokens.length != 2) {
				System.out.println("�߸��� ����Դϴ�");
			}
			else {
				if(tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("�߸��� ����Դϴ�.");
					continue;
				}
				
				int index = sb.indexOf(tokens[0]);
				
				if(index == -1) {
					System.out.println("ã�� �� �����ϴ�");
					continue;
				}
				sb.replace(index, index+tokens[0].length(), tokens[1]);
				System.out.println(sb.toString());
			}
		}
		
		scanner.close();
	}

}
