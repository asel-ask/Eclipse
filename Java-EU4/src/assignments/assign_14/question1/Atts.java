package assignments.assign_14.question1;

public class Atts {
	
	public String name,color;
	public int amount;
	
	@Override
	public String toString() {
		return "name:" + name + " color:" + color + " amount:" + amount;
	}
	
}
			// Didn't show anything in console, when i run. Therefore i created another packg
/*			
class AttsTest{
	public static void main(String[] args) {
		
		Atts a = new Atts();
		a.name="Laptop";
		a.color="Black";
		a.amount=1;
		
		System.out.println(a.toString());
		
	}
}
*/