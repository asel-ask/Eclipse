package repl_it;
import java.util.Scanner;
public class N_101_equalsJavaPython {

	public static void main(String[] args) {
		 

		 
		    Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine();
		    int javaCount = 0;
		    int pythonCount = 0;
//		    for(int i=0;i<sentence.length()-5;i++){
//		      if(sentence.substring(i,i+4).equalsIgnoreCase("java")){
//		        javaCount+=1;
//		      }else if(sentence.substring(i,i+6).equalsIgnoreCase("python")){
//		        pythonCount+=1;
//		      }
//		    }
//		  System.out.println(javaCount==pythonCount);
		    for(int i=0;i<sentence.length();i++){
		    if(sentence.contains("java")) {
		    	javaCount++;}
		    	 
		    if(sentence.contains("python")) {
		    	pythonCount++;}
		    }
		    System.out.println(javaCount+" "+pythonCount);
		    System.out.println(javaCount==pythonCount);

	}

}
