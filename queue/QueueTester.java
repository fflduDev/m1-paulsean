package queue;

public class QueueTester {

	public static void runTests(Queue queueInstance) {

		queueInstance.enqueue("Paul");
		queueInstance.enqueue("Sean");
		queueInstance.enqueue("Jan");
		queueInstance.enqueue("Jasiu");
		queueInstance.enqueue("Ronny");
		queueInstance.enqueue("Jeffrey");


		System.out.println("Displaying the queue: ");
		queueInstance.display();										//Displays the queue
												
		System.out.println("");

		System.out.println("Peeking the first element: ");
		System.out.println(queueInstance.peek());						//Peeks the first element of the queue

		System.out.println("");

		System.out.println("Dequeueing the first element: ");
		System.out.println(queueInstance.dequeue());					//Dequeues the first element of the queue

		System.out.println("");

		queueInstance.enqueue("Miles");
		queueInstance.enqueue("Gwen");							

		System.out.println("Peeking the first element: ");
		System.out.println(queueInstance.peek());						//Peeks the first element of the queue

		System.out.println("");

		System.out.println("Displaying the queue: ");
		queueInstance.display();										//Displays the queue

		queueInstance.dequeue();										//Dequeues the first element of the queue

		System.out.println("");

		System.out.println("Displaying the queue: ");
		queueInstance.display();										//Displays the queue



		


		
	}

}
