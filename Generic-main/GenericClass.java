package generics;

public class GenericClass<String> {
	
	private String data;
	
	public GenericClass(String data) {
		this.data=data;
	}
	
	public String get() {
		return data;
	}
	
	public void set(String data) {
		this.data = data;
	}

}
