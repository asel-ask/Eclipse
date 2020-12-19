package day36_staticClassMembers;

public class ABCTest {

	public static void main(String[] args) {
		
		  //call method only in static way
		ABC.m1(); 
		
		/*
		ABC o1=new ABC();	//error
		o1.m1();
		*/
		
		//whenever All of your methods in your class are static, and you want everyone to call them
		//static way Classname.methodname(), then you can simply make your constructor private
		
	}
	public static void print() {
		//static int a =5; // local variable CAN NOT be static
	}

}
