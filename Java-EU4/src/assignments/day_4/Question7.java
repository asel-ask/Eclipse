package assignments.day_4;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
	 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number in seconds");
		int seconds=s.nextInt();
		int minute,hour,day;
		if(seconds>=60 && seconds<3600) {
			minute=seconds/60;
			System.out.println("In "+seconds+" : "+minute+" minutes");
		}else if(seconds>=3600 && seconds<86400) {
			hour=seconds/3600;
			System.out.println("In "+seconds+" : "+hour+" hour");
		}else if(seconds>=86400) {
			day=seconds/86400 ;
			System.out.println("In "+seconds+" : "+day+" day");
		}

	}

}
