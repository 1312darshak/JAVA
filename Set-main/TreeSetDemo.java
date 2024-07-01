package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> courses = new TreeSet<>();
		courses.add("Core Java");
		courses.add("Python");
		courses.add("C++");
		courses.add("JavaScript");
		courses.add("SpringBoot");
		//courses.add(null);
		
		System.out.println("Courses Are :- "+courses);
		
		//SubSet Method
		Set<String> coursesSubSet =  courses.subSet("JavaScript", true, "SpringBoot", true);
		System.out.println("Courses SubSet Is :- "+coursesSubSet);
		
		//add
		//remove
		
	}

}
