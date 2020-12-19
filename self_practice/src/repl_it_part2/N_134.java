package repl_it_part2;
import java.util.*;
public class N_134 {

	public static void main(String[] args) {

		 

		 
		    Scanner scan = new Scanner(System.in);
				int sizeInner = scan.nextInt();
				int sizeOuter = scan.nextInt();
				int[] inner = new int[sizeInner];
				int[] outer = new int[sizeOuter];
				for(int i =0; i < sizeInner; i++) {
					inner[i] = scan.nextInt();
				}
				for(int j =0; j < sizeOuter; j++) {
					outer[j] = scan.nextInt();
				}
				Arrays.sort(inner);
				Arrays.sort(outer);
				//WRITE YOUR CODE HERE
				boolean flag=false;
				for(int i=0;i<sizeOuter;i++){
				   
				  for(int k=0;k<sizeInner;k++){
				    if(outer[i]==inner[k]){
				      flag=true;
				      break;
				    }else
				    	flag=false;
				  }
				}
				
				if(flag){
				  System.out.println(true);
				}else {
				  System.out.println(false);
				}
				
		

	}

}
