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
		
		for (String str : strArray){
			box.put(str);

			try {

				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		box.put("DONE");
	}

}
