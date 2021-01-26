package univer;

import java.util.Scanner;

public class New {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][] arr = new int[4][4];
    
    for(int i=0;i<arr.length;i++) {
    	
    }
    
    arr[0][0] = 3;
    arr[1][0] = 5;
    arr[2][0] = 6;

    int max = 1;

    // To use these variables outside of the loop, you need to 
    // declare them outside the loop.
    int x = 0;
    int y = 0;

    for (; x < arr.length; x++) {
        for (; y < arr[x].length; y++) {
            if (arr[x][y] > max) {
                max = arr[x][y];
                System.out.println(max);
            }
            System.out.println(arr[x][y]);
        }
    }

    // This print statement accesses x and y outside the loop
    System.out.println(arr[x][y]);
}
}
