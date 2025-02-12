package queue;

public class QueueImpl implements Queue {
	private Node front, rear;

	public QueueImpl() {
		this.front = this.rear = null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return front == null;
	}

	@Override
	//Adds new node to the back of the queue
	public void enQueue(String element) {
		Node newNode = new Node(element);
		if (rear == null) {
			front = rear = newNode;
		}
		else {
			rear.next = newNode;
			rear = newNode;
		}
		System.out.println(element + " added to queue.");

	}

	@Override
	//Removes the top element of the queue
	public String deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return null;
		}
		String removedData = front.Data;
		front = front.next;
		if (front == null) {
			front = rear = null;
		}
		System.out.println(removedData + " removed from queue.");
		return removedData;
	}

	@Override
	// Print all objects in queuee
	public void display() {
		if (isEmpty()){
			System.out.println("Queue is empty.");
			return;
		}
		else {
			Node temp = front;
			while (temp != null) {
				System.out.println(temp.Data);
				temp = temp.next;
			}
		}
	}

	@Override
	// Show the top element in the queue
	public String peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return null;
		}
		System.out.println(front.Data);
		return front.Data;
	}

}
