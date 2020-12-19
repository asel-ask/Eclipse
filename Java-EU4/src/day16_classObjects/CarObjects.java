package day16_classObjects;

public class CarObjects {

	public static void main(String[] args) {


		
		Car car1 = new Car();
		
		car1.printCarInfo();
		System.out.println();
		
		car1.make="Ford";
		car1.model="Fiesta";
		car1.currentSpeed=55;
		car1.color="Grey";
		
		car1.printCarInfo();
		car1.accelarate(20);
		car1.drive();
		car1.showCurrentSpeed(70);
		
		System.out.println("before: "+car1.currentSpeed);
		
		car1.accelarate(20);
		
		System.out.println("after: "+car1.currentSpeed);
	}

}
