package day34_constructorsPassingObjectToMethod;

public class DiseTest {

	public static void main(String[] args) {

		final int SIX_SIDES=6;
		final int TWENTY_SIDES=20;
		
		
		Dise d=new Dise(SIX_SIDES);
		Dise t=new Dise(TWENTY_SIDES);
		rollDise(d);
		rollDise(t);
	}

	public static void rollDise(Dise d) {
		//rolling a 6 sided dise
		//the dise value is 5
		System.out.println("Rolling a "+d.getSides()+" slided dise ");
		
		System.out.println("The dice value "+d.getValue());
	}
}
