package day39_inheritanceReview_accessModifier;

public class Car extends Vehicle {

	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currenGear;
	
	public Car(String name,String size, int wheels, int doors, int gears, boolean isManual) {
		super(name,size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currenGear = 1;
	}
	
	public void changeGear(int currentGear) {
		this.currenGear=currentGear;
	}
	
	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity():Velocity "+speed+" direction "+direction);
		move(speed,direction);
	}

	@Override
	public void move(int velocity, int direction) {
		setCurrentDirection(direction+10);
		setCurrentVelocity(velocity+10);
		System.out.println("vehicle.move(): Moving at "+getCurrentVelocity()+" in direction "+getCurrentDirection());
	}
	
	
	
}
