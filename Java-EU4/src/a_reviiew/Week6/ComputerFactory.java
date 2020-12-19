package a_reviiew.Week6;

public class ComputerFactory {

	public static void main(String[] args) {
		
		int x=10;

		//computer class is blueprint for computer objects
		//creating object using new keyword
		Computer c1=new Computer();
		//assigning value for each field
		c1.brand="Apple";
		c1.price=1300;
		c1.screeenSize=17;
		c1.screeenSize=15;
		
		System.out.println("computer 1 brand is "+c1.brand);
		System.out.println("computer 1 price is "+c1.price);
		System.out.println("computer 1 screeenSize is "+c1.screeenSize);
		
		Computer c2 = new Computer();
		c2.brand="ASUS";
		c2.price=345;
		c2.screeenSize=15;
		
		System.out.println("computer 2 brand is "+c2.brand);
		System.out.println("computer 2 price is "+c2.price);
		System.out.println("computer 2 screeenSize is "+c2.screeenSize);
		
		Computer c3 = new Computer();
		c3.brand="DELL";
		c3.price=250;
		c3.screeenSize=13;
		
		System.out.println("computer 3 brand is "+c3.brand);
		System.out.println("computer 3 price is "+c3.price);
		System.out.println("computer 3 screeenSize is "+c3.screeenSize);
	}

}
