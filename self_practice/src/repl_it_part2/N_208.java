package repl_it_part2;
import java.util.Arrays;
public class N_208 {

	public static int[] populate(int[] r) 
	{

		 
	 
				int [] newArr=new int[r.length];
				for(int i=0;i<r.length;i++){
				  newArr[i]=(i+1);
				}
				return newArr;
			}
			
			public static void main(String[] args) 
			{
			 
			  
		    int [] i= new int[3]; 
		    i= populate(i) ;
		    System.out.println(Arrays.toString(i));

			}
		 
	}

