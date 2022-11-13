package ½Ç½À6ÁÖÂ÷1;
import java.util.Scanner;

class Calendar{
	public void print(int y, int m, int d) {
		
	}
	
}

class Korean extends Calendar {
	public void print(int y, int m, int d) {
		System.out.println(y+"³â "+m+"¿ù "+d+"ÀÏ");
	}
}
class English extends Calendar {
	public void print(int y, int m, int d) {
		String month = null;
		switch(m) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		}
		System.out.println(d+" "+month+" "+y);
	}	
}
class Chinese extends Calendar {
	public void print(int y, int m, int d) {
		System.out.println(y+"Ò´ "+m+"êÅ "+d+"ìí");
	}
}
public class ½Ç½À6ÁÖÂ÷1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int year, month, date;
		year=input.nextInt();
		month=input.nextInt();
		date=input.nextInt();
		Calendar k = new Korean();
		k.print(year, month, date);
		Calendar e = new English();
		e.print(year, month, date);
		Calendar c = new Chinese();		
		c.print(year, month, date);
	}

}
