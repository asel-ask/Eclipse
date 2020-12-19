package day36_staticClassMembers;

public class Countable {
	
	//static variable
	static int instanceCount;

	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
	
}
