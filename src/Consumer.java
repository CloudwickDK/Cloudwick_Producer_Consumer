import java.util.Random;


public class Consumer implements Runnable {

	Box box;
	
	public Consumer(Box box){
		this.box = box;
	}
	
	public void run(){
		String message = null;
		Random rnd = new Random();
		while(!((message = box.take()).equals("DONE"))){
			System.out.println(message);

			try {
				Thread.sleep(Math.abs(rnd.nextInt(500)));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
