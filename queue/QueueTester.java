package queue;

public class QueueTester {

	public static void runTests(Queue queueInstance) {

		queueInstance.enqueue("first");
		queueInstance.enqueue("second");
		queueInstance.enqueue("third");
		queueInstance.enqueue("fourth");

		queueInstance.dequeue();
		queueInstance.dequeue();
		queueInstance.dequeue();

		System.out.println(queueInstance.peek());
		
	}

}
