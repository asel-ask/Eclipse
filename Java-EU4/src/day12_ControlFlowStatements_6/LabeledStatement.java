package day12_ControlFlowStatements_6;

public class LabeledStatement {

	public static void main(String[] args) {


		int i=0;
		outer: 
			do {
				i=8;
				inner:
					while(true) {
						System.out.println(i--);
						if(i==4) {
							break outer;
						}
					}
			} while (true);

	}

}
