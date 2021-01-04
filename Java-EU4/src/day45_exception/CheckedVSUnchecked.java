package day45_exception;

public class CheckedVSUnchecked {
public static void main(String[] args) {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
