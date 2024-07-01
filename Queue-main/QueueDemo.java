package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<5; i++)
		
			q.add(i);
			System.out.println("Element Of Queue :- "+q);
			
			int removedele = q.remove();
			System.out.println("Removed Element :- "+removedele);
			System.out.println(q);
			
			int head = q.peek();
			System.out.println("Head Of Queue :- "+head);
			
			int size = q.size();
			System.out.println("Size Of Queue :- "+size);
		
		
		

	}
	
}
