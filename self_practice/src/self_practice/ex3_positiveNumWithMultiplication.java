package self_practice;

import java.util.Scanner;

public class ex3_positiveNumWithMultiplication {

	public static void main(String[] args) {
		
		//Write a program that prompts the user to input a positive integer.
		//It should then print the multiplication table of that number. 

		Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        if(num>0) {
                
        System.out.println("Multiplication Table of " + num);
        
        for(int i=1; i<=10; i++)
        {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }}else if(num==0) {
        	System.out.println("You entered 0");
        }
        
        else {
        	System.out.println("You entered negative number");
        }
	}

}
