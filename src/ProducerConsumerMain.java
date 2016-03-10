
public class ProducerConsumerMain {
	public static void main(String[] args){
		Box box = new Box();
		Thread p = (new Thread(new Producer(box)));
		Thread c = (new Thread(new Consumer(box)));
		Thread p1 = (new Thread(new Producer(box)));
		Thread c1 = (new Thread(new Consumer(box)));
		Thread p2 = (new Thread(new Producer(box)));
		Thread c2 = (new Thread(new Consumer(box)));
		
		p.start();
		c.start();
		p1.start();
		c1.start();
		p2.start();
		c2.start();
		
		
	}
	

}
