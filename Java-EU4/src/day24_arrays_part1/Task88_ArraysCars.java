package day24_arrays_part1;
import java.util.*;
public class Task88_ArraysCars {
	public static void main(String[] args) {
		 
		String[] cars=new String[7];
		cars[0]="Honda";
		cars[1]="Toyota";
		cars[2]="Nissan";
		cars[3]="BMW";
		cars[4]="Mersedes";
		cars[5]="Porsche";
		cars[6]="Ferrari";
		
		System.out.println("Enter index number");
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int index=sc.nextInt();
		int price = 0;
		
		if(cars[index].equals("Honda") || cars[index].equals("Toyota") || cars[index].equals("Nissan")) {
			price=rn.nextInt((40000-20000)+1)+20000;
		}else if(cars[index].equals("BMW") || cars[index].equals("Mersedes")) {
			price=rn.nextInt((80000-50000)+1)+50000;
		}else if(cars[index].equals("Porsche") || cars[index].equals("Ferrari")) {
			price=rn.nextInt((150_000-100_000)+1)+100000;
		}
		System.out.println(cars[index]+" price is: "+price);

	}

}
