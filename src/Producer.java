import java.util.concurrent.ArrayBlockingQueue;

/**
 * 
 * @author Bhavin Tandel
 * @since 10/03/2016; 12:51
 */
public class Producer implements Runnable {

	ArrayBlockingQueue<String> queue;

	public Producer(ArrayBlockingQueue<String> queue) {
		this.queue = queue;

	}

	public void run() {
		String[] strArray = { "The", "Lazy", "Fox", "Jumps", "Over", "Brown", "Dog" };

		try {
			for (String str : strArray) {
				queue.put(str);
				Thread.sleep(15);
			}
			queue.put("DONE");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
