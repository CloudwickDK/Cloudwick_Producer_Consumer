/**
 * 
 * @author Bhavin Tandel
 *
 */
public class ProducerConsumerMain {
	public static void main(String[] args){
		Box box = new Box();
		Thread p = (new Thread(new Producer(box)));
		Thread c = (new Thread(new Consumer(box)));
		Thread p1 = (new Thread(new Producer(box)));
		Thread c1 = (new Thread(new Consumer(box)));
	
		
		p.start();
		c.start();
		p1.start();
		c1.start();
	
		
		
	}
	

}
