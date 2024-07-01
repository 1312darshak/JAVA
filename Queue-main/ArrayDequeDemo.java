package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		Deque<String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.add("A");
		arrayDeque.add("B");
		arrayDeque.add("C");
		
		arrayDeque.offer("F");
		
		arrayDeque.offerFirst("D");
		arrayDeque.offerLast("E");
		
		Iterator<String> iterator = arrayDeque.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("After Poll :- ");
		String s = arrayDeque.poll();
		System.out.println("Poll Item Is :- "+s);
		
		for(String item : arrayDeque) {
			System.out.println(item);
		}
		
		//Poll Method
		
		


	}

}
