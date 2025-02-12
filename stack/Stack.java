package stack;

public interface Stack<T> {
 
	public void push(T s);
	public T pop();
	
	public Boolean isEmpty();
	public Boolean isFull();
	
	public int size();
	public T peek();
	
	public void setCapacity(int size);
	public void display();
}
