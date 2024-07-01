package multi_threads;

public class MythreadExecutor {

	public static void main(String[] args) {
		
		MyThread A1 = new MyThread();
		System.out.println("Before Runnable Stage Thread Is Alive Or Not ?"+A1.isAlive());
		
		A1.start();
		try {
			Thread.sleep(4000);
		}
		
		catch(Exception e) {
			System.out.println("Thread Is Interrupted");
		}
		System.out.println("After Complete Execution Of Thread, Is Alive Or Not ?"+A1.isAlive());
		

	}

}
