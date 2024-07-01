package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		//create a Stream from set of value
		Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 60, 70);
		
		//counting the values
		System.out.println(stream.count());
		//stream.forEach(System.out::println);//printing stream value--->another way
	
		//create array
		Integer[] values = new Integer[] {10, 20, 30, 13, 10, 11, 12, 13};
		//creating the stream from array
		stream = Arrays.stream(values);
		
		//MAP 
		System.out.println("Square of "+Arrays.toString(values)+"is as Follows:-");
		
		//Methods
		//stream.map(num -> num * num).forEach(System.out::println);
		
		stream = stream.map(n -> n * n);
		stream.forEach(System.out::println);
		
		//Limit
		System.out.println("First 2 Elements are :- ");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		//Skip
		System.out.println("Elements Excepts First 4 :- ");
		Arrays.stream(values).skip(4).forEach(System.out::println);
		
		//Distinct (remove duplicate value)
		System.out.println("Distinct Elements are :- ");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		List<String> words = Arrays.asList("Hello","Stream","Leraning");
		//words.add("Happy"); //immutable list
		
		//create a stream from list
		
		//toUppercase
		//toLowercase
		//Collect--->Collectors--->applicable in list and set
		
		Stream<String> stream1 = words.stream();
		System.out.println(words);
		
		
	}

}
