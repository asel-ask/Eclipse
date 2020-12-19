package day32_arrayListCount;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {

		ArrayList<Integer>numList=new ArrayList<>();
		numList.add(10);
		numList.add(10);
		numList.add(7);
		numList.add(8);
		numList.add(3);
		numList.add(4);
		numList.add(8);
		
		printList(numList);
		
		ArrayList<Double>doubleList=new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		double sum=sumList(doubleList);
		System.out.println(Math.round(sum));
		
		ArrayList<Integer> list=getList(15);
		System.out.println(list.toString());
		
		ArrayList<Integer> rList=getRandomList(20);
		System.out.println(rList.toString());
		
		ArrayList<String>strNums=new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");
		
		ArrayList<Integer> converted=converToIntList(strNums);
		System.out.println(converted);
		
	}
	public static ArrayList<Integer> converToIntList(ArrayList<String> strNums) {

		ArrayList<Integer> newList=new ArrayList<>();
		for(String str : strNums) {
			
			newList.add(Integer.parseInt(str));
		}
		
		
		return newList;
	}
	public static ArrayList<Integer> getRandomList(int num) {
		Random rn=new Random();
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=1;i<=num;i++) {
			
				
				l.add(rn.nextInt(101));
		}

		return l;
	}
	public static ArrayList<Integer> getList(int size) {

		ArrayList<Integer> l=new ArrayList<>();
		for(int i=1;i<=size;i++) {
			
			l.add(i);
		}
		return l;
	}
	public static double sumList(ArrayList<Double> doubleList) {
		double sum=0.0;
		for(Double d : doubleList) {
			sum+=d;
		}
			return sum;
	}
	public static void printList(ArrayList<Integer> numList) {
		
		for(Integer n : numList) {
		
		System.out.print(n+" ");
		}System.out.println();
	}
}
