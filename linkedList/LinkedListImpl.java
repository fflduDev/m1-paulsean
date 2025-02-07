package linkedList;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

public class LinkedListImpl<T> implements LinkedList<T> {

	ListItem<T> head = null;

	// Internal func that iterates through the list. useful in lots of internal ops

	private void forEach(Function<ListItem<T>, Boolean> callback) {

		ListItem<T> prospectiveItem = head;

		while (prospectiveItem != null) {

			boolean stop = callback.apply(prospectiveItem);
			
			prospectiveItem = prospectiveItem.next;

			if (stop) break;

		}

	}

	private ListItem<T> getTail() {

		ListItem<T> prospectiveItem = head;

		while (prospectiveItem.next != null) {

			prospectiveItem = prospectiveItem.next;

		}

		return prospectiveItem;
		
	}

	@Override
	public Boolean isItemInList(T thisItem) {

		AtomicBoolean isFound = new AtomicBoolean(false);

		this.forEach((ListItem<T> item) -> {

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
	public Boolean addItem(T thisItem) {
		
		if (head == null) {

			// list empty, so new item is head

			head = new ListItem<T>(thisItem);
			return true;

		}

		ListItem<T> tail = getTail();

		tail.next = new ListItem<T>(thisItem);

		return true;

	}

	@Override
	public Integer itemCount() {

		AtomicInteger count = new AtomicInteger(0);

		this.forEach((ListItem<T> item) -> {

			count.getAndIncrement();

			return false; // keep going until last

		});

		return count.get();
		
	}

	@Override
	public void listItems() {

		this.forEach((ListItem<T> item) -> {

			System.out.println(item.data.toString()); // now that everything is generic, we should call .toString to print

			return false; // keep going until last

		});
		
	}

	@Override
	public Boolean deleteItem(T thisItem) {

		if (!this.isItemInList(thisItem)) {

			return false;

		}

		this.forEach((ListItem<T> item) -> {

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
	public Boolean insertBefore(T newItem, T itemToInsertBefore) {

		return null; // TODO: Implement this

	}

	@Override
	public Boolean insertAfter(T newItem, T itemToInsertAfter) {

		return null; // TODO: Implement this

	}

	@Override
	public void sort() {

		return; // TODO: Try to implement this
		
	}
	
}