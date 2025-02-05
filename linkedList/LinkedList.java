package linkedList;
 
public interface LinkedList {

	// true if it is, false if not
	public Boolean isItemInList(String thisItem);

	// true if added, false if it was already there, or an error	
	public Boolean addItem(String thisItem);

	public Integer itemCount();

	public void listItems();
	
	// true if deleted, false if not there or error
	public Boolean deleteItem(String thisItem);

	public Boolean insertBefore(String newItem, String itemToInsertBefore);
	public Boolean insertAfter(String newItem, String itemToInsertAfter);

	//EC: ascending alphanumeric sort; nothing fancy but ALTERS THE LIST, DOES NOT COPY.
	public void sort();

}

// Implement this interface using class ListItem
//  Also implement the tester in this package.