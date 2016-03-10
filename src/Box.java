/**
 * 
 * @author Bhavin Tandel
 * @since  10/03/2016; 12:41
 */
public class Box {
	private String message ;
	private boolean empty;
	
	public Box(){
		empty = true;
	}
	
	public synchronized String take(){
		while(empty){
			try{
				wait();
			}catch (InterruptedException e) {
			}
		}
		notifyAll();
		empty = true;
		return message;
	}
	
	public synchronized void put(String message){
		while(!empty){
			try{

				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = false;
		this.message = message;
		notifyAll();

	}

}
