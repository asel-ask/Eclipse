package day8_controlFlowStaemenst_2;

public class task34 {

	public static void main(String[] args) {
		
		int math=100;
		int chemistry=70;
		int biology=10;
		
		double avarage=(math+chemistry+biology)/3;
		System.out.println(avarage);
		
		if(avarage>=0&&avarage<=59) {
			System.out.println("Grade is F");
		} else if(avarage>=60&&avarage<=69) {
			System.out.println("Grade is D");
		}else if (avarage>=70&&avarage<=79) {
			System.out.println("Grade is C");
		}else if(avarage>=80&&avarage<=89) {
			System.out.println("Grade is B");
		}else if (avarage>=90&&avarage<=100) {
			System.out.println("Grade is A");
		}
			
	}

}
