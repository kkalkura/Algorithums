package sample.assignment.concurrent.lambda;

public class Sample {
	
	public static void main(String[] arguments){
		Runnable task = () ->
		{	while(!Thread.currentThread().isInterrupted()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("hello world");
		}
		};
		Thread thread = new Thread(task);
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();
	}

}
