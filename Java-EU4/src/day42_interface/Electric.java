package day42_interface;

public interface Electric {
	
	public static final boolean HAS_BATTERIES=true;
	
	boolean HAS_BATTERIES2=false; //java will put auto --> public final static <--in the beginning 
	
	public abstract void charge();
	
	void charge2(); // public abstract is there automatically
	
	public default void methodA() {
		//code
	}
	
	public static void MethodB() {
		//code
	}
}
