package repl_it_part2;
import java.util.Arrays;
public class N_207 {

	public static void main(String[] args) {


		int [] arr= {1,2,3,4};
		System.out.println(Arrays.toString(do_switch(arr)));
		
	}
	
	public static int[] do_switch(int[] i) 
	 {
	   
	    int temp=i[0];
	    i[0]=i[i.length-1];
	    i[i.length-1]=temp;
	    
	    return i;
	    
		}
	}

