package repl_it_part2;
import java.util.*;
public class N_129_CopyCertainValues {

	public static void main(String[] args) {


		    System.out.println("-----EXAMPLE RUN ---------");
		    String[] numbers = {"zero", "one", "two","three","four"};
		    System.out.println(Arrays.toString(getWithE(numbers)));
		    
		  }
		  
		  
		  
		  public static String[] getWithE(String[] arr) {
		    
		    //TODO : YOUR CODE GOES HERE ----------------------
		    int count=0;
		    String fV="";
		    for(int i=0; i<arr.length;i++){
		      if(arr[i].contains("e")){
		        count++;
		        fV+=arr[i];
		      }
		    }
		    String[] fewValues=new String[count];
		   
		    
		      fewValues[0]=fV;
		    
		    
		    
		    
		    
		    //YOUR CODE ENDS HERE -----------------------
		    
		    return fewValues;
		  }
	
	}
