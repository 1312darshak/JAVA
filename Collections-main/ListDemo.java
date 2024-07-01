package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	
	public static void main(String[] args) {
		
		List list1 = new ArrayList(); 
		//created empty array list(allow heterogeneous elements)
		
		System.out.println("Size"+list1.size());
		System.out.println("Is This Empty? "+list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.78);
		list1.add(20);
		list1.add('A');
		list1.add(5,"Hii");
		list1.add(10);
		System.out.println("List Is :- "+list1);
		
		System.out.println("Is List Contains 15 ?"+list1.contains(15));
		list1.remove(false);
		
		System.out.println("List Is :- "+list1);
		
		System.out.println("Element at 5th Location is :-"+list1.get(5));
		System.out.println("Element Removed :- "+list1.remove(list1.lastIndexOf(10)));
		System.out.println("Element Removed :- "+list1.remove(list1.indexOf(10)));
		
		System.out.println("List Is :- "+list1);
		
		/*Collections.sort(list1);
		System.out.println("List Is :- "+list1);*/
		
		list1.clear();
		System.out.println("List Is :- "+list1);
		
		//Generic //Generation //Homogeneous
		List<String> names = new ArrayList<>();
		names.add("Darshak");
		names.add("Sachin");
		names.add("Neeraj");
		names.add("Pankaj");
		names.add("Shrey");
		
		System.out.println("List Is :-"+names);
		Collections.reverse(names);
		
		System.out.println("Reversed Name List Is :-"+names);
		
		//Traverse A List
		
		Iterator<String> i = names.iterator();
		while(i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);
			
			if(nm.equals("Shrey"))
				i.remove();
			
		}
		
		System.out.println("Name List Is :- "+names);
		
		ListIterator<String> li = names.listIterator(names.size());
		
		while(li.hasPrevious())
		{
			String nm=li.previous();
			System.out.println(nm);
		}
	}

}
