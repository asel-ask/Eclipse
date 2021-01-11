package day47_collection_part2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue <String> queque=new LinkedList<>();
		queque.add("Mike");
		queque.add("Ozzy");
		queque.add("Jamal");
		queque.add("Asiya");
		
		System.out.println(queque.toString());

		String name=queque.remove();
		System.out.println(name);
		
		System.out.println(queque);
		
		//it will return null if queue is empty
		name=queque.poll();
		System.out.println(name);
		
		System.out.println(queque.toString());
		
		//get the element at the front of the queue without removing it using peek()
		name=queque.peek();
		System.out.println(name);
		System.out.println(queque.toString());
		
	}
}
