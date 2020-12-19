package a_reviiew.Week6;

public class GarbageCollection {

	public static void main(String[] args) {
		
		//process of cleaning up unused objects from the heap memory

		Computer c1=new Computer();
				 c1=null;
				 
		Computer c2=new Computer();
		c1=c2;
		
		System.out.println("The end");

	}

}
