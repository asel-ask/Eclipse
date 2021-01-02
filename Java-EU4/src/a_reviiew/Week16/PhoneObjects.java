package a_reviiew.Week16;

public class PhoneObjects {

	public static void main(String[] args) {
		
		Iphone phone1=new Iphone("11", 8.0, 2000);
		Phone phone2=new Iphone("8", 6.5, 1000);
		Object phone3=new Iphone("5", 5.5, 500);
		AppleApp phone4=new Iphone("7", 7.0, 1500);
		
		phone1.faceTime(123456123);
		((Iphone)phone2).faceTime(45678913);
		((Iphone) phone4).faceTime(123465789);
		
		phone1.download();
		((Iphone)phone2).download();
		((AppleApp)phone2).download();
		
	}
}
