package a_reviiew.Week4;

public class MultiplicationTable {

	public static void main(String[] args) {


		for(int tableNum=1; tableNum<=12; tableNum++) {
			System.out.println("Multiplication Table for "+tableNum);
			for(int i=1;i<=10;i++) {
				System.out.println(tableNum+" X "+i+"\t="+(tableNum*i));
			} 
		}
	}

}
