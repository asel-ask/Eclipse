package day44_oop_review.call_center;

public interface VoiceCallable {

	boolean CAN_CALL=true;
	
	void call(String contact);
	
	static void decline() {
		System.out.println("Mike decline voice call...");
	}
	
	default void accept() {
		System.out.println("Mike accepted voice call...");
	}
}
