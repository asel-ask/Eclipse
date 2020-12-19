package repl_it_part2;
import java.util.*;
public class N_132_ArraysDive {

	public static void main(String[] args) {

		 

		 
		    Scanner input = new Scanner(System.in);
		    float[] score = new float[7];
		    //WRITE YOUR CODE HERE
		    int sum=0;
		    float max = 0;
		    float min = 0;
		    for(int i=0;i<score.length;i++){
		      System.out.print("Enter score for judge "+(i+1)+":");
		      score[i]=input.nextFloat();
		       
		      if(score[i]>max) {
		    	  max=score[i];
		      }
		      min=max;
		      if(score[i]<min) {
		    	  min=score[i];
		      }
		      sum+=score[i];
		    }
		    System.out.println(max+" "+ min);
		    System.out.print("Enter difficulty:");
		    double difficulty=input.nextDouble();
		    
		    double total=(sum-min-max)*difficulty*0.6;
		    // FINAL OUTPUT
		  
		    System.out.printf("Total: %.2f", total);
		 
	
	
	
	
	}
	
}
