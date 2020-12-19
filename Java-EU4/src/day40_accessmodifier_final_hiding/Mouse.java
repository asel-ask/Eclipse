package day40_accessmodifier_final_hiding;

public class Mouse extends Robent{

	protected int tailLength=8;
	
	public void getMouseDetails() {
		System.out.println("tail: "+tailLength+", parentTail: "+super.tailLength);
	}
}
