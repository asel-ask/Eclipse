package day13_methods_part1;

public class Task63_temparatureConvertor {

	public static void main(String[] args) {

		calculateCelcius(50);
		

	}
	
	public static void calculateCelcius(double fahrenheit) {
		double celcius= (fahrenheit-32)*5/9;
		System.out.println(celcius);
	}
}
