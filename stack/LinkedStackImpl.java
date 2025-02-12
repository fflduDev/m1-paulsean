package stack; 

public class LinkedStackImpl<T> implements Stack<T> {

	public StackNode<T> top;

	@Override
	public void push(T item) {

		StackNode<T> newItem = new StackNode<T>(item); 
	
		if (top == null) {

			// top must be assigned 

			top = newItem;
			return;

		}

		// otherwise, the new item must be inserted at top and top be moved to the next item

		newItem.next = top;
		top = newItem;
	
	}

	@Override
	public T pop() {

		if (top == null) {

			// nothing to pop

			return null;

		}

		T item = top.data; // get the data
		top = top.next; // reassign the top to the next item

		return item;
		
	}

	@Override
	public Boolean isEmpty() {

		return top == null; // top will be null if the stack is empty

	}

	@Override
	public Boolean isFull() {

		return false; // can never be full 

	}

	@Override
	public int size() {

		int count = 0;

		StackNode<T> current = top;

		while (current != null) {

			count++;
			current = current.next;

			// will stop when current == null -> means end

		}

		return count;

	}

	@Override
	public T peek() {

		return top.data; 

	}

	@Override
	public void setCapacity(int size) {

		return; // don't need to do this

	}

	@Override
	public void display() {

		StackNode<T> current = top;

		while (current != null) {

			System.out.println(current.data);
			current = current.next;

		}

	}
	
}