package a_reviiew.Week12;

public class Test {

	public int score;
	
	public Test(int score) {
		this.score=score;
	}
	
	

 
	public static void main(String[] args) {
		Test test01=new Test(10);
		System.out.println(test01.score);
		Test test02=new Test(20);
		System.out.println(test02.score);
	}
}