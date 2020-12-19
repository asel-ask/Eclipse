package day16_classObjects;

public class CellphoneObjects {

	public static void main(String[] args) {


		Cellphone cellphone1 = new Cellphone();
		
		cellphone1.brand="Iphone";
		cellphone1.color="Blue";
		cellphone1.price=4500;
		cellphone1.screenSize=5.5;
		
		System.out.println(cellphone1.brand);
		System.out.println(cellphone1.color);
		System.out.println(cellphone1.price);
		System.out.println(cellphone1.screenSize);
			
		cellphone1.color="Black";
		System.out.println(cellphone1.color);
		
		cellphone1.call();
		cellphone1.message();
		cellphone1.takeAphoto();
		
		 

	}

}
