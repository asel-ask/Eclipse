package a_reviiew.Week16;

public class Samsung extends Phone implements AndroidApp {
	
	/*create a class named Samsung that inherits Phone and AndroidApp
    - actions: texting(), calling(), SamsungPay() [ All have long phoneNumber argument ]
    - create a constructor to initialize the fields (brand, model, size, price)
        if the price is more than 1500 don't set the price and print: Invalid Price, 
        Samsung's price cannot more than 1500 */

	public Samsung( String mode, double price, double size) {
		super("Samsung", mode, price, size);
		
		if(price>1500) {
			System.out.println("Samsung cannot be more than 1500");
			price=0;
		}
	}
	public void samsungPay() {
		System.out.println("Using samsung pay");
	}

	@Override
	public void download() {
		System.out.println("Downloading "+ APP_NAME);
	}

	@Override
	public void texting(long phoneNumber) {
		System.out.println("Texting "+phoneNumber);
		
	}

	@Override
	public void calling(long phoneNumber) {
		System.out.println("Calling "+phoneNumber);
		
	}

		
	
	

}
