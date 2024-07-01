package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 12, -4, 15, -6, 7, 8);
		
		//Retrieve the stream
		Stream<Integer> stream = intList.stream().filter((a) ->  a > 0);
		
		//Filter stream of positive numbers
		//stream = stream.filter((a) -> a > 0);
		stream.forEach(System.out::println);
		
		//stream = intList.stream().filter((a) -> a > 0);
		//Stream<Integer> newStream = intList.stream().filter((a) -> a > 0);
		//stream=Stream.of();
		//reduce to return the maximum numbers
		
		Optional<Integer> result = stream.reduce((a, b) -> a > b ? a : b);
		
		if(result.isPresent())
			System.out.println("Maximum Element is :- " +result.get());
		else
			System.out.println("Stream is empty for given operation :- ");
		
		//Filtered Stream of positive numbers 
		stream = intList.stream().filter((a) -> a > 0);
		
		//reduce to sum of all positive number
		result = stream.reduce((a, b) -> a + b);
		if(result.isPresent())
			System.out.println("Sum of all Positive Elements Is :- " + result.get());
		else
			System.out.println("Stream is empty for given operation");
		
		//Filtered Stream of Even Numbers
		stream = intList.stream().filter((a) -> a % 2 == 0);
		
		//reduce to sum of Even Numbers
		result = stream.reduce((a, b) -> a + b);
		if(result.isPresent())
			System.out.println("Sum of All Even Elements is :- " + result.get());
		else
			System.out.println("Stream is empty for given operation");
	}
		

}
