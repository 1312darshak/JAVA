package multi_threads;

import threads.ThreadClass;

public class ThreadMethodDemo {

	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass(5,"First");
		ThreadClass t2 = new ThreadClass(8,"Second");
		
		System.out.println("Current Thread: "+Thread.currentThread());
		
		t1.start();
		t2.start();
		
		Thread.currentThread().setName("Parent Thread");
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		System.out.println("Current Thread: "+Thread.currentThread());
		
		try {
			t1.join();
			t2.join();
		}
		
		catch(Exception e) {
			System.out.println("Thread Is Interrupted");
		}
		System.out.println("-----------End Of Main-----------");

	}

}
