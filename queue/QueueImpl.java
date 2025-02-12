package queue;

public class QueueImpl implements Queue {

	int length = 10;
	String[] Queue = new String[length];


	@Override
	public boolean isFull() {
		return Queue[length - 1] != null;
	}

	@Override
	public boolean isEmpty() {
		if (Queue[0] == null) {
			return true;
		}
		return false;
	}

	@Override
	public void enqueue(String element) {

		if (this.isFull()) {

			return;

		}
	
		if (Queue[0] == null) {

			Queue[0] = element;
			return;

		} 

		int i = 0;
		
		while (Queue[i] != null) {

			i++;

		}

		Queue[i] = element;
		
	
	}

	@Override
	public String dequeue() {

		if (this.isEmpty()) {

			return null;

		}

		String returnedString = Queue[0];

		for (int i = 0; i < Queue.length - 1; i++) {

			Queue[i] = Queue[i + 1];

		}
		
		return returnedString;

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String peek() {

		if (this.isEmpty()) {

			return null;

		}

		return Queue[0];

	}

}
