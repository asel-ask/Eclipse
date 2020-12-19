package day15_methodsOverload_part2;

public class MethodOverloading {

	public static void main(String[] args) {


		System.out.println(sum(5, 6));
		int x=sum(10, 20, 30, 40);
		System.out.println(x);
		
	}

	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b,int c) {
		return a+b+c;
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
		
	}
}

/* 1-Number of parameters
 * 		add(int,int)
 * 		add(int,int,int)
 * 
 * 2-DataType of parameters
 * 		add(int,int)
 * 		add(int,float)
 * 
 * 3-Sequence of dataType parameters
 * 		add(int,float)
 * 		add(float,int)
 * 
 * Invalid case -Not overloading --->return type
 * 		int add(int,int)
 * 		float add(int,int)
 * 
 * */
