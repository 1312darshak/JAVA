package synchronised;

class Counter {
	private int count;
	
	public synchronized void increment() {
		count = count+1;
	}
	
	public int getCount() {
		return count;
	}
}

public class Synchronized {
	public static void main(String[] args)throws InterruptedException {
		
		Counter c = new Counter();
		System.out.println(c.getCount());
	}

}
