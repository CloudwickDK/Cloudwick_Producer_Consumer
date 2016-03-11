import java.util.concurrent.ArrayBlockingQueue;

/**
 * 
 * @author Bhavin Tandel
 *	
 */
public class Consumer implements Runnable {

	ArrayBlockingQueue<String> arrayBlockingQueue;
	
	public Consumer(ArrayBlockingQueue<String> arrayBlockingQueue){
		this.arrayBlockingQueue = arrayBlockingQueue;
	}
	
	public void run(){
		String message = null;
		try {
			while(!((message = arrayBlockingQueue.take()).equals("DONE"))){
			System.out.println(message);

			
				Thread.sleep(15);
			}
		}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}//Consumer
