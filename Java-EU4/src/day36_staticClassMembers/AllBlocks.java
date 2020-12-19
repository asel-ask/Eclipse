package day36_staticClassMembers;

public class AllBlocks {

	public AllBlocks(int x) {
		System.out.println("One argument constructor");
	}
	
	public AllBlocks(){
		System.out.println("No argument constructor");
	}
	static {
		System.out.println("First static init");
	}
	
	{	//instance block
		System.out.println("Fisrt instance init");
	}
	{
		System.out.println("Second instance init");
	}
	static {  //static block
		System.out.println("Second static init");
	}
}
