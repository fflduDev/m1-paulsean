package queue;

public class QueueImpl implements Queue {

	int length = 10;
	String[] Queue = new String[length];


	@Override
	public boolean isFull() {					//checks if the queue is full
		return Queue[length - 1] != null;
	}

	@Override
	public boolean isEmpty() {					//checks if the queue is empty
		if (Queue[0] == null) {
			return true;
		}
		return false;
	}

	@Override
	public void enqueue(String element) {		//adds an element to the queue

		if (this.isFull()) {					//checks if the queue is full

			return;

		}
	
		if (Queue[0] == null) {					//Adds element to the first position

			Queue[0] = element;
			return;

		} 

		int i = 0;
		
		while (Queue[i] != null) {				//Adds element to the next availible position

			i++;

		}

		Queue[i] = element;
		
	
	}

	@Override
	public String dequeue() {					//removes an element from the queue

		if (this.isEmpty()) {

			return null;

		}


		String returnedString = Queue[0];		//Saves content of first element 

		for (int i = 0; i < Queue.length - 1; i++) {		//Moves all elements one position forward

			Queue[i] = Queue[i + 1];

		}
		
		return returnedString;					//returns the content of the first element

	}
 
	@Override
	public void display() {						//displays all elements in the queue

		for (int i = 0; i < Queue.length; i++) {

			if (Queue[i] != null) {

				System.out.println(Queue[i]);

			}

		}

	}
	@Override
	public String peek() {						//displays the first element in the queue

		if (this.isEmpty()) {					

			return null;

		}

		return Queue[0];

	}

}
