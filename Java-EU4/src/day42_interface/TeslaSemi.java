package day42_interface;

public class TeslaSemi extends ElectricTruck{
	
	private double engineSize;

	public TeslaSemi(String model, double price, String color,double engineSize) {
		super(model, price, color);
		this.engineSize=engineSize;
	}

	@Override
	public void load(String item) {
		System.out.println("Tesla semi load "+item+" by lowering the truck and opening door...");
		
	}

	@Override
	public void start() {
		System.out.println("Tesla semi start truck by pressing button...");
		
	}

	@Override
	public void charge() {
		System.out.println("Tesla semi pluging charge for 30 mins...");
		
	}

	@Override
	public void drive() {
		System.out.println("Tesla semi truk is driving with load...");
		
	}

	public double getEngineSize() {
		return engineSize;
	}

	
	
}
