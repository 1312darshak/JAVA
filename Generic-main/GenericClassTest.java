package generics;

public class GenericClassTest {

	public static void main(String[] args) {
		//GenericClass with String type of DataMember
		GenericClass<String> stringObj = new GenericClass<String>();
		stringObj.set("Hello");
		System.out.println(stringObj/get());
		
		//GenericClass with Integer type of DataMember
		GenericClass<Integer> integerObj = new GenericClass<Integer>();
		integerObj.set(10);
		System.out.println(integerObj.get());
		
		//GenericClass with Person object of DataMember
		GenericClass<Person> personObj = new GenericClass<Person>();
		personObj.set(new Person("Muskan", "Ahmedabad"));
		System.out.println(personObj.get());

	}

}
