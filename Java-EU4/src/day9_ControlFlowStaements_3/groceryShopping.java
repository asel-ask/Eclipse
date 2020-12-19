package day9_ControlFlowStaements_3;
import java.util.Scanner;
public class groceryShopping {

	public static void main(String[] args) {

		
		
		Scanner scan= new Scanner(System.in);
	    String item1=scan.next();
	    String item2=scan.next();
	    String item3=scan.next();
	    double price1=scan.nextDouble();
	    double price2=scan.nextDouble();
	    double price3=scan.nextDouble();
	    
	    System.out.println(item1+"\n"+price1);
	    System.out.println(item2+"\n"+price2);
	    System.out.println(item3+"\n"+price3);
	    
	    
	    double totalPrice=price1+price2+price3;
	    String report="Item1:"+item1+" price :"+price1+", Item2: "+item2+" price : "+price2+", Item3: "+item3+" price :"+price3;
	    
	    System.out.println(report);
	    System.out.println("Total Price: "+totalPrice);
	}

}
