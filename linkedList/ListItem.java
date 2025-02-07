package linkedList;

public class ListItem<T> {

	public T data;
	public ListItem<T> next;
	
	public ListItem(T data) {

		this.data = data;
		this.next = null;

	}

}