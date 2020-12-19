package repl_it_part2;
import java.util.Scanner;
	public class N_118_Arrays {
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			String[] arr = new String[6];
			for (int i=0;i<6;i++)
			{
				arr[i] = input.nextLine();
			}
			//leave above alone! :)   
			//assume you have String array of 6 items 
			//and print three neibouring items at a time till last item
			//write your code below
			for(int i=0;i<6;i++){
			  if(i==4) {
				  break;
			  }
			  System.out.println(arr[i].concat(" , ").concat(arr[i+1])
			    .concat(" , ").concat(arr[i+2]));
			
			}
			
		}
	}

