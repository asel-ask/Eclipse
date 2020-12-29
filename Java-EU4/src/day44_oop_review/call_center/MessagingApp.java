package day44_oop_review.call_center;

public abstract class MessagingApp {

	public String name;
	protected boolean isFree;
	boolean allOSCompatible;
	private static int count;
	static final String APP_TYPE="Messenger";
	
	public MessagingApp() {
		System.out.println("Messaging no args constructor...");
	}
	
	public MessagingApp(String name,int count) {
		this.name=name;
		this.count=count;  //MessagingApp.count=count;
	}
	
	public abstract void sendMessage(String msg);
	
	public void launch() {
		System.out.println("Messaging app is launching");
	}
	
	public static void close() {
		System.out.println("Messaging app is closing");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MessagingApp.count = count;
	}
	
	
	
	
	
	
}
