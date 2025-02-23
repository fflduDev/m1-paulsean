package queue;

public interface Queue {

	boolean isFull() ;
	boolean isEmpty();
	
	// insert elements to the queue
	void enqueue(String element);
	
	// delete element from the queue
	String dequeue();
	
	// display element of the queue
	void display();
	
	//display 'first' element 
	public String peek();
	
}
