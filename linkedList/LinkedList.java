package linkedList;
 
public interface LinkedList<T> {

	// true if it is, false if not
	public Boolean isItemInList(T thisItem);

	// true if added, false if it was already there, or an error	
	public Boolean addItem(T thisItem);

	public Integer itemCount();

	public void listItems();
	
	// true if deleted, false if not there or error
	public Boolean deleteItem(T thisItem);

	public Boolean insertBefore(T newItem, T itemToInsertBefore);
	public Boolean insertAfter(T newItem, T itemToInsertAfter);

	//EC: ascending alphanumeric sort; nothing fancy but ALTERS THE LIST, DOES NOT COPY.
	public void sort();

}

// Implement this interface using class ListItem
//  Also implement the tester in this package.