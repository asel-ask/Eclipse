package day9_ControlFlowStaements_3;
import java.util.Scanner;
public class Scanner_temperatureConvertor {

	public static void main(String[] args) {


		Scanner input=new Scanner(System.in);
		
		System.out.println("What is the temperature in F ?");
		
		double fahrenheit=input.nextDouble();
		double celcius= (5.0/9)*(fahrenheit-32);
		
		System.out.println("Fahrenheit "+fahrenheit+" is "+celcius+" in celcius");
		
		
		
		
	}

}
