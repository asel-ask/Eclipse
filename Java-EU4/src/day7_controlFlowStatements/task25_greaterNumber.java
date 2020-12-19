package day7_controlFlowStatements;

public class task25_greaterNumber {

	public static void main(String[] args) {
		
		int i1=400;
		int i2=80;
		int i3=1000;
		
		if(i1>i2 && i1>i3) {
			System.out.println("i1 is a greatest one");
		}
		if(i2>i1&&i2>i3) {
			System.out.println("i2 is a greatest one");
		}
		if(i3>i1&&i3>i2) {
			System.out.println("i3 is a greatest one");
		}

	}

}
