package day16_classObjects;

public class ContactObjects {

	public static void main(String[] args) {
		 
		
		Contact cont1= new Contact();
		
		System.out.println(cont1.name);
		
		cont1.name="Ruby";
		cont1.phoneNumber="055568445";
		cont1.email="123@gmail.com";
		
		System.out.println(cont1.name);
		System.out.println(cont1.phoneNumber);
		System.out.println(cont1.email);
		
		cont1.call();
		cont1.sendMessage();
		cont1.sendEmail();

	}

}
