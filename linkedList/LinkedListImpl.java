package linkedList;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

public class LinkedListImpl<T extends Comparable<T>> implements LinkedList<T> {

	ListItem<T> head = null;

	// Internal func that iterates through the list. useful in lots of cases

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

		AtomicBoolean wasInserted = new AtomicBoolean(false);

		if (head == null) {

			// list empty, so new item is head

			head = new ListItem<T>(newItem);

			return true;

		}

		this.forEach((ListItem<T> item) -> {

			if (item.next != null && item.next.data.equals(itemToInsertBefore)) {

				// the next item is what we're looking for, so insert the new item before it

				ListItem<T> newItemInstance = new ListItem<T>(newItem);

				newItemInstance.next = item.next;

				item.next = newItemInstance;

				wasInserted.set(true);

				return true; // stop for efficiency

			} else {

				return false; // keep looking

			}

		});

		return wasInserted.get();

	}

	@Override
	public Boolean insertAfter(T newItem, T itemToInsertAfter) {

		AtomicBoolean wasInserted = new AtomicBoolean(false);

		this.forEach((ListItem<T> item) -> {

			if (item.data.equals(itemToInsertAfter)) {

				// the current item is what we're looking for, so insert the item after it and rehook the prev next item

				ListItem<T> newItemItem = new ListItem<T>(newItem);

				newItemItem.next = item.next;

				item.next = newItemItem;

				wasInserted.set(true);

				return true; // stop, efficiency 

			} else {

				return false; // keep going

			}

		});

		return wasInserted.get();
		
	}

	@Override
	public void sort() {		

		// Bubble Sort!

		// we loop through the list, swapping items that are out of order
		// we may get to the end and still have items that are out of order, so we loop again
		// we will keep looping until no more swaps are needed

		boolean hasSwapped = true;

		while (hasSwapped) {

			hasSwapped = false; // reset the swap flag for this iteration

			ListItem<T> prospectiveItem = head; // start at the head

			while (prospectiveItem.next != null) { // loop until the end of the list

				if (prospectiveItem.data.compareTo(prospectiveItem.next.data) > 0) {

					// the prospective item is greater than the next item, so swap them

					T tempItem = prospectiveItem.data;
					
					prospectiveItem.data = prospectiveItem.next.data;
					prospectiveItem.next.data = tempItem;

					hasSwapped = true; // now, we can loop again. this will keep the loop going until no more swaps are needed

				}

				prospectiveItem = prospectiveItem.next; // move to the next item if we haven't swapped. if we did, we don't want to skip the next item

			}

		}

	}
	
}