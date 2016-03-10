import java.util.Random;

/**
 * 
 * @author Bhavin Tandel
 * @since  10/03/2016; 12:51
 */
public class Producer implements Runnable {
	Box box;
	
	public Producer(Box box){
		this.box = box;

	}
	
	public void run(){
		String[] strArray = {"The", "Lazy", "Fox", "Jumps", "Over", "Brown", "Dog"};
		Random rnd = new Random();
		for (String str : strArray){
			box.put(str);

			try {

				Thread.sleep(Math.abs(rnd.nextInt(500)));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		box.put("DONE");
	}

}
