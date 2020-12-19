package day16_classObjects;

public class DogObjects {

	public static void main(String[] args) {
	 
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		dog1.age=10;
		dog1.breed="Maltese";
		dog1.color="Black";
		dog1.name="Rover";
		
		 
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		
		dog1.barking();
		dog1.sleeping();
		dog1.hungry();
		
		System.out.println("***********************");
		
		dog2.age=2;
		dog2.breed="Buldog";
		dog2.color="Black";
		dog2.name="Taty";
		
		 
		System.out.println(dog2.age);
		System.out.println(dog2.color);
		System.out.println(dog2.breed);
		
		dog2.barking();
		dog2.sleeping();
		dog2.hungry();
		
		System.out.println("************************");

		dog3.age=3;
		dog3.breed="Shihtzu";
		dog3.color="Creamy";
		dog3.name="Love";
		
		 
		System.out.println(dog3.age);
		System.out.println(dog3.color);
		System.out.println(dog3.breed);
		
		dog3.barking();
		dog3.sleeping();
		dog3.hungry();
		
	}

}
