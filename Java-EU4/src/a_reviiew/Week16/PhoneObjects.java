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
		phone4.download();
		System.out.println();
		
		phone1.calling(123456487);
		phone2.calling(78946131);
		((Phone)phone3).calling(741852963);
		((Iphone)phone3).calling(789456123);
		((Phone)phone4).calling(123456789);
		
		((Phone)phone1).calling(1234);
		
		
		
	}
}
