package day47_collection_part2;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		//last in first out (LIFO)
		//Stack <Integer> numStack=new Stack<>();
		Vector <Integer> numStack=new Stack<>();
		numStack.add(50);
		numStack.add(70);
		numStack.add(500);
		numStack.add(25);
		
		//creating object
		//regular way --> Class - Class
		//polymorphic way --> Parent/Interface - Class
		
		System.out.println(numStack.toString());
		//System.out.println(numStack);
		
		//check value on top of stack
		//.peek()--> shows last in
		//System.out.println(numStack.peek()); 
		System.out.println(((Stack<Integer>) numStack).peek());
		
		//read value on top of the stack then remove it
		//System.out.println(numStack.pop());
		System.out.println(((Stack<Integer>) numStack).pop());
		
		System.out.println(numStack.toString());
		
		System.out.println(numStack.get(1));
		
	}
}
