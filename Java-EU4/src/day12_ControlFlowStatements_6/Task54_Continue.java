package day12_ControlFlowStatements_6;

public class Task54_Continue {

	public static void main(String[] args) {


		int start=1;
		int sum=0;
		
		do {
			
			if(start%2==0) {
				continue;
			}
			sum+=start;
		}while (++start<=10);
		System.out.println(sum);

	}

}
