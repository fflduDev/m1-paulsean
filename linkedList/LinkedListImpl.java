package linkedList;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

public class LinkedListImpl implements LinkedList {

	ListItem head = null;

	// Internal func that iterates through the list. useful in lots of internal ops

	private void forEach(Function<ListItem, Boolean> callback) {

		ListItem prospectiveItem = head;

		while (prospectiveItem != null) {

			boolean stop = callback.apply(prospectiveItem);
			
			prospectiveItem = prospectiveItem.next;

			if (stop) break;

		}

	}

	private ListItem getTail() {

		ListItem prospectiveItem = head;

		while (prospectiveItem.next != null) {

			prospectiveItem = prospectiveItem.next;

		}

		return prospectiveItem;
		
	}

	@Override
	public Boolean isItemInList(String thisItem) {

		AtomicBoolean isFound = new AtomicBoolean(false);

		this.forEach((ListItem item) -> {

			if (item.data.equals(thisItem)) {

				isFound.set(true);

				return true; // stop the loop for efficiency

			} else {

				return false; // keep going to try to find

			}

		});

		return isFound.get();

	}

	@Override
	public Boolean addItem(String thisItem) {
		
		if (head == null) {

			// list empty, so new item is head

			head = new ListItem(thisItem);
			return true;

		}

		ListItem tail = getTail();

		tail.next = new ListItem(thisItem);

		return true;

	}

	@Override
	public Integer itemCount() {

		AtomicInteger count = new AtomicInteger(0);

		this.forEach((ListItem _) -> {

			count.getAndIncrement();

			return false; // keep going until last

		});

		return count.get();
		
	}

	@Override
	public void listItems() {

		this.forEach((ListItem item) -> {

			System.out.println(item.data);

			return false; // keep going until last

		});
		
	}

	@Override
	public Boolean deleteItem(String thisItem) {

		if (!this.isItemInList(thisItem)) {

			return false;

		}

		this.forEach((ListItem item) -> {

			if (item.next != null && item.next.data.equals(thisItem)) {

				// the next item is forgotten

				item.next = item.next.next;

				return true; // stop the loop for efficiency

			} else if (item.data.equals(thisItem)) {

				// the head becomes something new because the head is being deleted

				head = item.next;

				return true; // stop the loop for efficiency

			} else {

				return false; // carry on

			}

		});

		return true;

	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {

		return null;

	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {

		return null;

	}

	@Override
	public void sort() {
		
	}
	
}