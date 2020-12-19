package assignments.day_9;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		/*When word has odd number of characters and:
		     - 3 or more characters, print middle letter
		              oak ==> a
		              javav ==> v
		     - Single character, print that character 3 times
		             # ==> ###
		             q ==> qqq
		            When word has even number of characters and:
      		- 4 or more characters, print middle 2
            		java ==> av
            		apples ==> pl
            		#$%^&* ==> %^
    			- 2 characters, print those 2 characters twice
           			@@ ==>@@@@
           			$$ ==>$$$$
           			hi ==> hihi
			*/
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=s.next();
		
		if(word.length()%2!=0) {
			if(word.length()>=3) {
				System.out.println(word.charAt(word.length()/2));
			}else if(word.length()==1) {
				for(int i=0;i<3;i++) {
					System.out.print(word.charAt(0));
				}
			}
		}else {
			if(word.length()==2) {
				  for(int i=0; i<2;i++){
				        System.out.print(word.substring(0,2));
				          
				        }
					
				}else if(word.length()>=4) {
					
				        System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
					 
				}
				
			}
		}
		

	}


