package threads;

public class ThreadClassExecutor {

	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass(5,"First");
		ThreadClass t2 = new ThreadClass(7,"Second");
		
		t1.start();
		t2.start();

	}

}
