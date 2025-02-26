package linkedList;

public class LinkedListTester {

    public static void runTests(LinkedList<String> tester) {

        // creating a String implementation
        tester.addItem("Fairfield");
        tester.addItem("Bridgeport");
        tester.addItem("Brooklyn");
        tester.addItem("Easton");

        System.out.println("List of Items: ");
        tester.listItems();															//Lists Items

        System.out.println("");

        System.out.println("Are items in the list: ");
        System.out.println("Fairfield: " + tester.isItemInList("Fairfield"));				//True
        System.out.println("Weston: " + tester.isItemInList("Weston"));					//False

        System.out.println("");

        System.out.println("Listed items without Bridgeport:");
        tester.deleteItem("Bridgeport");									//Deletes Bridgeport
        tester.listItems();															//Lists Items

        System.out.println("");

        System.out.println("Listed items with Queens before Brooklyn:");
        tester.insertBefore("Queens", "Brooklyn");		//Inserts Queens before Brooklyn
        tester.listItems();															//Lists Items

        System.out.println("");

        System.out.println("Listed items with Stamford after Fairfield:");
        tester.insertAfter("Stamford", "Fairfield");		//Inserts Stamford after Fairfield
        tester.listItems();															//Lists Items

    }

}
