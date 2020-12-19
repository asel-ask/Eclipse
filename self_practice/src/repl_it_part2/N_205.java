package repl_it_part2;
import java.util.*;
public class N_205 {

	public static void main(String[] args) {
		
		int [] arr= {10,40,50,3,1};
		int [] arr1= {11,0,500,44,1101};
		System.out.println(Arrays.toString(addElements(arr, arr1)));
		
	}
	 
	  public static int[] addElements(int[] ints1, int[] ints2) {
	    
	    int [] newArr=new int[ints1.length];
	    for(int i=0;i<newArr.length;i++){
	    	for(int j=0;j<newArr.length;j++){
	        newArr[i]=ints1[i]+ints2[i];
	    	}
	    }
	    return newArr;
	  }
	  
	  
	
}
