package repl_it_part2;
import java.util.Arrays;
public class N_190 {

	 
 
	  public static int[] mergR(int[] a,int[] b) {
	    int [] newArr=new int[a.length+b.length];
	    for(int i=0;i<a.length;i++){
	    	
	    	newArr[i]=a[i];
	    }
	    int c=0;
	    for(int i=a.length;i<newArr.length;i++) {
	    	newArr[i]=b[c];
	    	c++;
	    }
	    	return newArr;
	    
	  }//end mergR
	  
	  public static void main(String[] args) 
	  {
		  int[] arr= {1,2,3};
		  int[] arr1={4,5,6};
		  System.out.println(Arrays.toString(mergR(arr, arr1)));
		  
		  
	  }
	}
	
	
	

