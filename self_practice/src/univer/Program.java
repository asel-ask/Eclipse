package univer;

import java.util.Scanner;

public class Program {

	public static int convertArray(int [][]a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
			if(a[i][j]<0) {
				a[i][i]=Math.abs(a[i][i]);
				sum++;
			}
			System.out.print(a[i]+" ");
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       
	       System.out.println("Enter array elements : ");
			int [][] a=new int[4][4];
			  for(int i=0; i<4;i++)
		         {            
		            for(int j=0; j<4;j++)
		            {
		                a[i][j]=sc.nextInt();
		            }
		         }
			
			System.out.println("Convertion time: "+convertArray(a));

	}

}
