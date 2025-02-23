package app;
 
import linkedList.LinkedListImpl;
import linkedList.LinkedListTester;

import queue.QueueImpl;
import queue.QueueTester;

import stack.StackTester;
import stack.LinkedStackImpl;

public class StagBusClient {

	public static void main(String[] args) {
		
		System.out.println("-----L I S T  T E S T------");

		LinkedListTester.runTests(new LinkedListImpl<Integer>());
		
		System.out.println("-----S T A C K  T E S T------");

		StackTester.runTests(new LinkedStackImpl<String>());

		System.out.println("----Q U E U E  T E S T-------");

		QueueTester.runTests(new QueueImpl());
				
	}

}
