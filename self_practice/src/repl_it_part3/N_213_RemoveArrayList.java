package repl_it_part3;
import java.util.*;
public class N_213_RemoveArrayList {

	 

	
	  public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
	  {
		  ArrayList<Integer>instance=new ArrayList<>();
	   for(Integer i=0;i<r.size();i++){
	     if(r.get(i)==n){
	       instance.add(r.get(i));
	     }
	   }
	   	r.removeAll(instance);
	   	return r;
	  }
	  
	  public static void main(String[] args)
	  {
	  
	    ArrayList<Integer>  arr = new ArrayList<>();
	    Integer[] nums = new Integer[]{1,1,2,3};
	    arr.addAll(Arrays.asList(nums));
	    
	    System.out.print(removeInst(arr,1));
	   
	    
	  }//end main
	}

