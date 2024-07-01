package threads;

public class ThreadClass extends Thread {

	private int n;
	private String message;
	
	public ThreadClass(int n, String message)
	{
		this.n=n;
		this.message=message;
	}
	
	public void run() {
		for(int i=0;i<=n;i++)
		{
			try {
				Thread.sleep(300);
			}
			catch(Exception e)
			{
				System.err.println("Thread Interrupted"+e.getMessage());
			}
			System.out.println(message+i+" "+"Current Thread"+Thread.currentThread().getName());
			
		}
	}

}
