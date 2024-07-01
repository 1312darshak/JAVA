package collections;

import java.util.Iterator;
import java.util.Vector;

//Linked list 
		/*add(); addFirst(); addLast(); getFirst();
		getLast(); removeFirst(); removeLast(); sort();
		reverse();		*/

public class VectorClass {

	public static void main(String[] args) {
		
		Vector<String> animals = new Vector<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Sloth");
		System.out.println("Initial Veactor:- "+animals);
		
		String element = animals.get(2);
		System.out.println("Element At Index 2 :- "+element);
		
		//Using Iterator Method
		Iterator<String> i = animals.iterator();
		//System.out.println("Vector: ");
		
		while(i.hasNext()) {
			System.out.println(i.next());
			System.out.println(", ");
			
			
		}
		element = animals.remove(1);
		System.out.println("Removed Elements :- "+element);
		System.out.println("New Vector :-"+animals);
		

	}

}
