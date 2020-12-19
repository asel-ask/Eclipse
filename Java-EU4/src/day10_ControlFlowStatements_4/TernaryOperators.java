package day10_ControlFlowStatements_4;

public class TernaryOperators {

	public static void main(String[] args) {
		String result;
		int score=88;
		
//		if(score>60) {
//			result="Pass";
//		}else {
//			result="Fail";
//		}
		
		result=score>60 ? "Pass":"Fail";
		System.out.println(result);
		
		int x=5;
		System.out.println(x>2 ? x<4 ? 10:8:7);
		if(x>6) {
			if(x<4) {
				System.out.println(10);
			}else {
				System.out.println(8);
			}
		}else {
			System.out.println(7);
		}
	}

}
