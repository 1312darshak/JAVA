package multi_threads;

public class MyThread extends Thread {

	public void run()
	{
		System.out.println("Inside Run() Thread Is Alive Or Not? "+this.isAlive());
		int no=0;
		while(no<4)
		{
			no++;
			System.out.println("number ="+no);
			try {
				sleep(500);
			}
			catch(Exception e) {
				System.out.println("Thread Interrupted");
			}
		}
	}

}
