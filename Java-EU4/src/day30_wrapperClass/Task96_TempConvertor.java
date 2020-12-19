package day30_wrapperClass;

public class Task96_TempConvertor {

	public static void main(String[] args) {

		String str1="Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		
		String [] arr=str1.split("and ");
		arr=arr[1].split(" degree");
		
		
		double num=Double.parseDouble(arr[0]);

		double celcius=(num-32)*5/9;
		
		System.out.println(num+" degree is equal to "+Math.round(celcius)+" celcius");
		
	}

}
