import java.util.LinkedList;

/**
 * 
 * @author Bhavin Tandel
 * @since  10/03/2016; 12:41
 */
public class Box {
	private LinkedList<String> messages ;
	private int queueSize;
	public boolean empty;
	
	public Box(){
		messages = new LinkedList<String>();
		queueSize = 5;
		empty = true;
	}
	
	public synchronized String take(){
		while(empty){
			try{
				System.out.println("I am in take function");
				wait();
			}catch (InterruptedException e) {
				//System.out.println("I am in take function");
			}
		}
		notifyAll();
		String message= messages.pop();
		empty = messages.isEmpty();
		return message;
	}
	
	public synchronized void put(String message){
		while(this.messages.size() >= queueSize){
			try{
				System.out.println("I am in put function");
				wait();
			} catch (InterruptedException e) {
				//System.out.println("I am in take function");
			}
		}
		this.messages.push(message);
		empty = message.isEmpty();
		notifyAll();
	}

}
