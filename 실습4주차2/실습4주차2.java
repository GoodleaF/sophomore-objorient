package �ǽ�4����2;
import java.lang.String;
public class �ǽ�4����2 {

	public static void main(String[] args) {
		Car car;
		car =new Car();
		System.out.println("����: "+car.carBrand);
		System.out.println("�� �̸�(����): "+car.carName);
		System.out.println("���� ��ȣ��: "+car.carIdentified);
		car.changeCarStart();
		car.changeCarStart();
		car.changeGear();
	}

}
class Car{
	String carBrand="Kia";
	String carName="K9";
	int carMakeYear=2012;
	boolean isCarStarting = 1<0;
	String carIdentified="��1234";
	char carGear='P';
	void changeGear(){
		if(isCarStarting) {
			carGear = 'D';
			System.out.println("��� ���� : "+carGear);
		}
	}
	void changeCarStart() {
		if(!isCarStarting) {
			System.out.println("���� �õ� ����: ���� �õ��� �ɾ��ֽñ� �ٶ��ϴ�.\n");
			isCarStarting = 1>0;
		}
		else {

			System.out.println("���� �õ� ����: �õ� �Ϸ� �� ��� ����");
		}
	}
}