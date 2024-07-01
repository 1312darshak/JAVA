package runnable;

public class RunnableDemo {

	public static void main(String[] args) {
		UsingRunnable obj = new UsingRunnable(10,20,"Hello");
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable With Anonymous Class");
			}
			
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		runnable = () -> {
			System.out.println("Runnable With Lambda Expression");
		};
		new Thread(runnable).start();
		
		System.out.println("------------------------------------");
		int n=5;
		runnable = () -> {
			try {
				for(int i = 1; i <=n; i++) {
					System.out.println("Loop Iteration: "+i);
					Thread.sleep(1000);
				}
				
			}catch (InterruptedException e) {
				System.err.println("Task Interrupted");
			}	
			
		};
		
		new Thread(runnable).start();
	}

}
