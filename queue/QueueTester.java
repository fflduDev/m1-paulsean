package queue;

public class QueueTester {

	public static void main(String[] args) {

		Queue queueInstance = new QueueImpl();

		queueInstance.enqueue("first");
		queueInstance.enqueue("second");
		queueInstance.enqueue("third");
		queueInstance.enqueue("fourth");

		queueInstance.dequeue();
		queueInstance.dequeue();
		queueInstance.dequeue();
		queueInstance.dequeue();

	}

}
