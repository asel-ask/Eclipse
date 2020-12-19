package day23_randomClass;

import java.util.Random;

public class Task84 {

	public static void main(String[] args) {
		 
		Random rn=new Random();
		
		for(int i=0;i<10;i++) {
			if(rn.nextInt(2)==0) {
				System.out.println("Tails");
			}else {
				System.out.println("Heads");
			}
		}

	}

}
