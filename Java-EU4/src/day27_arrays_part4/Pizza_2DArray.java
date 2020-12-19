package day27_arrays_part4;
import java.util.Arrays;
public class Pizza_2DArray {
	public static void main(String[] args) {

		String [][] pizza= {
				{"pinneapple","pepperoni"},
				{"anchovies","mushroom","olives"},
				{"4 cheese"},
				{"chicken","tomatoes","onions"},
				{"green peppers","zuccini","brocoli","spinash","shrimp"}
		};
		
		System.out.println("### FOR ITERATOR LOOP###");
		for(int i=0;i<pizza.length;i++) {
			System.out.print(pizza[i].length+"-");
			System.out.println(Arrays.toString(pizza[i]));
		}
//			for(int j=0;j<pizza[i].length;j++) {
//				System.out.print(pizza[i][j]+" ");
//			}System.out.println();
//		}
		
		System.out.println();
		
		System.out.println("### FOR EACH LOOP###");
		for(String [] pizzas : pizza) {
			System.out.print(pizzas.length+"-");
			System.out.println(Arrays.toString(pizzas));
		}
		for(String value : pizza[3]) {
			System.out.println(value);
		}
		
		int[][] students= {{4,5,6},{12,5,7},{23,56,12,55,3}};
		for(int [] group: students) {
			for(int studenID : group) {
				System.out.print(studenID+" ");
			}System.out.println();
		}
		
		
	}

}
