import java.util.concurrent.ArrayBlockingQueue;

/**
 * 
 * @author Bhavin Tandel
 *
 */
public class ProducerConsumerMain {
	public static void main(String[] args){
		
		int queueSize = 20;
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(queueSize);
		//Box box = new Box();
		Thread p = (new Thread(new Producer(queue)));
		Thread c = (new Thread(new Consumer(queue)));
		Thread p1 = (new Thread(new Producer(queue)));
		Thread c1 = (new Thread(new Consumer(queue)));
	
		
		p.start();
		c.start();
		p1.start();
		c1.start();
	
		
		
	}
	

}
