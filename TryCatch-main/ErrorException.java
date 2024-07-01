package trycatch;

public class ErrorException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=20;
		b=30;
		
		try {
			int[] arr = {1, 2, 3, 4, 5};
			c = a/b;
			System.out.println(arr[10]);
			System.out.println("Will not be printed");
		}
		
		catch(ArithmeticException ar) {
			System.out.println("Can not divide any number"+ ar.getMessage());
		}
		catch(Exception eo) {
			System.out.println(eo.getMessage());
		}
		finally {
			System.out.println("Byee....Byee....");
		}
	}

}
