package 실습9주차1;

public class 실습9주차1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findClass();
	}
	
	public static void findClass() {
		try {
			Class clasis=Class.forName("what.the.Heck");
		}
		catch(Exception e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
