package a_reviiew.Week16;

public abstract class Phone {
	/*
	 create an abstract class named Phone
     - instance variables: brand, model, price, size
     - abstract methods: texting(), calling() [ All have long phoneNumber argument ]
     - create a constructor to initialize the fields
         if the price is negative or 0 don't set the price and print: Invalid Price,
          cannot be negative or 0
*/
	
	String brand;
	String mode;
	double price;
	double size;
	
	public Phone(String brand, String mode, double price, double size) {
		this.brand = brand;
		this.mode = mode;
		this.size = size;
		if(price<=0) {
			System.out.println("Price cannot be negative or 0");
		}else this.price=price;
	}
	
	public abstract void texting(long phoneNumber);
	public abstract void calling(long phoneNumber);
	

}
