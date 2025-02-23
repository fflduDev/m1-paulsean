package linkedList;

public class LinkedListTester {

	public static void runTests(LinkedList<Integer> tester) {

		// creating a String implementation
		
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
