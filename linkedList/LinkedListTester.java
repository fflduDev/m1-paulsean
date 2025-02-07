package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {

		// creating a String implementation
		
		LinkedList<String> tester = new LinkedListImpl<>();

		tester.addItem("an item to add");
		tester.addItem("another item to add");

		System.out.println("Item count: " + tester.itemCount());

		tester.listItems();

		System.out.println("Item in list? " + tester.isItemInList("an item to add"));

		System.out.println("Item in list? " + tester.isItemInList("not in list"));

		tester.deleteItem("an item to add");

		System.out.println("Item count: " + tester.itemCount());

		tester.listItems();

		boolean returnType = tester.deleteItem("not in list");

		System.out.println("Item not in list, delete return: " + returnType);

		tester.addItem("an item to add");

		tester.addItem("another item to add");

		tester.addItem("a third item to add");

		tester.listItems();
		
	}

}
