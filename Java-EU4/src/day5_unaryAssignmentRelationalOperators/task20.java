package day5_unaryAssignmentRelationalOperators;

public class task20 {

	public static void main(String[] args) {


		int a=1;
		int result=-a-- + a++ / -a--*--a;
		
		//a in memory => 1 -> 0 -> 1 -> 0 -> -1
		//result      =>-1 + 0 / -1 * -1 = -1+0*-1=-1
		
		
		System.out.println("a ="+ a);
		System.out.println(result);
		
		
		
	}

}
