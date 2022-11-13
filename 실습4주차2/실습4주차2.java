package 실습4주차2;
import java.lang.String;
public class 실습4주차2 {

	public static void main(String[] args) {
		Car car;
		car =new Car();
		System.out.println("차량: "+car.carBrand);
		System.out.println("차 이름(종류): "+car.carName);
		System.out.println("차량 번호판: "+car.carIdentified);
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
	String carIdentified="바1234";
	char carGear='P';
	void changeGear(){
		if(isCarStarting) {
			carGear = 'D';
			System.out.println("기어 변경 : "+carGear);
		}
	}
	void changeCarStart() {
		if(!isCarStarting) {
			System.out.println("차량 시동 유무: 차량 시동을 걸어주시기 바랍니다.\n");
			isCarStarting = 1>0;
		}
		else {

			System.out.println("차량 시동 유무: 시동 완료 후 대기 상태");
		}
	}
}