package day33_classObjectContructor;

public class Mouse {

	int numTeeth;
	int numWhiskers;
	int weight;
	//1
	public Mouse(int weight) {
		this(30, weight); // u calling constructor,  we can call only 1 constructor
		this.weight = weight;
		System.out.println("JAVA");
	}
	
	//2
	public Mouse(int numTeeth, int weight) {
		this(numTeeth,20,weight);
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("JS");
	}
	
	//3
	public Mouse(int numTeeth, int numWhiskers, int weight) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("C");
	}
	
	public void print() {
		System.out.println(weight+" "+numTeeth+" "+numWhiskers);
	}
	 
	
	
	
	
}
