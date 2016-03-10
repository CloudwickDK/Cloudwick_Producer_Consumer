
public class Consumer implements Runnable {

	Box box;
	
	public Consumer(Box box){
		this.box = box;
	}
	
	public void run(){
		String message = null;
		while(!((message = box.take()).equals("DONE"))){
			System.out.println(message);

			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
