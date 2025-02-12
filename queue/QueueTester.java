package queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue queue = new QueueImpl();

		//adding elements to queue
		queue.enQueue("11111");
		queue.enQueue("22222");
		queue.enQueue("33333");
		queue.enQueue("44444");
		queue.enQueue("55555");

		//Display all elements
		queue.display();

		//Check front element
		queue.peek();

		//removing three front elements
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();

		//displaying remaining elements
		queue.display();

		//check front again
		queue.peek();

	}
}
