package a_reviiew.Week16;

public class Iphone extends Phone implements AppleApp{
	
	/*create a class named iPhone that inherits Phone and AppleApp
    - actions: texting(), calling(), faceTiming() [ All have long phoneNumber argument ]
    - create a constructor to initialize the fields (brand, model, size, price)
        if the price is more than 2000 don't set the price and print: Invalid Price,
         Iphone's price cannot more than 2000 */

	public Iphone( String mode, double price, double size) {
		super("Iphone", mode, price, size);
		
		if(price>2000) {
			System.out.println("Iphone's price cannot be more than 2000");
			price=0;
		}
	}

	public void faceTime(long phoneNumber) {
		System.out.println("Facetiming: "+phoneNumber);
	}
	
	@Override
	public void download() {
		System.out.println("Downloading from: "+APP_NAME);
		
	}

	@Override
	public void texting(long phoneNumber) {
		System.out.println("Testing to: "+phoneNumber);
		
	}

	@Override
	public void calling(long phoneNumber) {
		System.out.println("Calling:"+phoneNumber);
	}

		
		
	
	
	
}
