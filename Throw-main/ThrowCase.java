package throwExample;

public class ThrowCase {

	private int number;
	public int Number() {
		
		return number;
	}
	
	public void setNumber(int num) {
		
		try {
			if(num % 2 == 0) {
				throw new Exception();
			}
			this.number = num;
		}
		catch(Exception e) {
			System.out.println("Number Can't Be Even....");
		}
	}
}
