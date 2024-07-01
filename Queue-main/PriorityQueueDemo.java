package queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<String> prior = new PriorityQueue<>();
		
		prior.add("Core Java");
		prior.add("React");
		prior.add("HTML");
		prior.add("Angular");
		
		System.out.println(prior);
		
		prior.remove("Angular");
		System.out.println("After Removed :- "+prior);
		
		System.out.println("Poll Method :- "+prior.poll());
		System.out.println("Final Queue :- "+prior);
		
		Iterator<String> iterator = prior.iterator();
		
		while (iterator.hasNext())
		{
			System.out.println(iterator.next() + " ");
		}
		
		System.out.println(prior.peek());
		System.out.println(prior.poll());
		System.out.println(prior.peek());
		
		
	}

}
