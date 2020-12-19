package day24_arrays_part1;
import java.util.Scanner;
public class Task86 {
	public static void main(String[] args) {
		
		
		 Scanner sc=new Scanner(System.in);
		 String[] month=new String[12];
		 month[0]="Jan";
		 month[1]="Feb";
		 month[2]="March";
		 month[3]="Apr";
		 month[4]="May";
		 month[5]="June";
		 month[6]="July";
		 month[7]="Aug";
		 month[8]="Sep";
		 month[9]="Oct";
		 month[10]="Nov";
		 month[11]="Dec";
		 
		 System.out.print("Enter index of month");
		 int index=sc.nextInt();
		 
		 System.out.println("The month is "+month[index]);
		 
		 
		 
		 
	}

}
