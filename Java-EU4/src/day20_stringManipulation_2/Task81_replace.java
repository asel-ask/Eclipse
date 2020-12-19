package day20_stringManipulation_2;

public class Task81_replace {

	public static void main(String[] args) {


		System.out.println(timeStamp("10/10/2019 14:59:00"));

	}

	public static String timeStamp(String date) {
		
		date=date.replace("/", "").replace("/","").replace(" ", "").replace(":", "").replace(":", "");
		return date;
	}
}
