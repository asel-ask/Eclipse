package day36_staticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {
		
		Dinner mom=new Dinner();
		Dinner kid=new Dinner();
		Dinner dad=new Dinner();
		
		System.out.println("Total slices: "+Dinner.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
	//	System.out.println(dad.pizzaSlice);
		System.out.println(Dinner.pizzaSlice);
		kid.takeASlice(2);
		dad.takeASlice(3);
	//	mom.takeASlice();
		
		System.out.println(Dinner.pizzaSlice);
	}
}
