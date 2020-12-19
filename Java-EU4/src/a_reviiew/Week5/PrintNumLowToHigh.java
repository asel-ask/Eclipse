package a_reviiew.Week5;

public class PrintNumLowToHigh {

	public static void main(String[] args) {

		printNumberlowToHigh(1);

	}
	
	public static void printNumberlowToHigh(int num){
		if(num>10) {
			System.out.println("End");
			return;
		}
		
		System.out.print(num+" ");
		printNumberlowToHigh(num+1);
		}
	
}
