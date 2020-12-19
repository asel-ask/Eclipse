package repl_it_part2;
import java.util.Scanner;
public class N_117_Arrays {

	public static void main(String[] args) {

		 
		 
				Scanner input = new Scanner(System.in);
				String[] arr = new String[8];
				for (int i=0;i<8;i++)
				{
					arr[i] = input.nextLine();
				}
				//leave above alone! :)   
				//assume you have String array of 8 items 
				//and print two items at a time in 4 line
				//write your code below
				for(int i=0;i<8;i++){
				  System.out.println(arr[i].concat(",").concat(arr[i+1]));
				  i++;
				}
				
		 

	}

}
