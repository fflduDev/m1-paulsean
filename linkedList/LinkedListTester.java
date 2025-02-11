package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {

		// creating a String implementation
		
		LinkedList<Integer> tester = new LinkedListImpl<>();

		// tester.addItem("an item to add");
		// tester.addItem("another item to add");

		// System.out.println("Item count: " + tester.itemCount());

		// tester.listItems();

		// System.out.println("Item in list? " + tester.isItemInList("an item to add"));

		// System.out.println("Item in list? " + tester.isItemInList("not in list"));

		// tester.deleteItem("an item to add");

		// System.out.println("Item count: " + tester.itemCount());

		// tester.listItems();

		// boolean returnType = tester.deleteItem("not in list");

		// System.out.println("Item not in list, delete return: " + returnType);

		// tester.addItem("an item to add");

		// tester.addItem("another item to add");

		// tester.addItem("a third item to add");

		// tester.listItems();

		tester.addItem(1);
		tester.addItem(5);
		tester.addItem(2);
		tester.addItem(10);
		tester.addItem(3);
		tester.addItem(11);

		tester.sort();

		tester.listItems();
		
	}

}
