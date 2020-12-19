package repl_it_part2;
import java.util.*;
public class N_126_PrintShortest2 {

	public static void main(String[] args) {
		 

		 
		 
		    Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    String []  word=  str.split(", ");
		    
		    String shortest=word[0];
		    for( String value : word){
		      if(value.length()<shortest.length()){
		      shortest=value;
		      }
		    } 
		    int count=0;
		    for( String value : word){
		      if(value.length()==shortest.length()){
		         count++;
		       }
		    } 
		    int x=0;
		    String [] newArr=new String [count];
		    for( String value : word){
		      if(value.length()==shortest.length()){
		    	  newArr[x]=value;
		        x++;
		      }
		    }
		    Arrays.sort(newArr);
		    System.out.println(Arrays.toString(newArr));
		}
		  
		}
