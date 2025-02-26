package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

	public static void main(String[] args) {
		// create implementation, then
		LinkedList stationList = new LinkedListImpl();
		Stack stack = new StackImpl();
		Queue queue = new QueueImpl();

		System.out.println("-----L I S T  T E S T------");
		
		//listRunTestMethod
		stationList.addItem("Central");
		stationList.addItem("University");
		stationList.addItem("Hospital");
		stationList.addItem("Mall");
		System.out.println("Current list:");
		stationList.listItems();
		System.out.println("Is Hospital in list? " + stationList.isItemInList("Hospital"));
		System.out.println("Deleting University...");
		stationList.deleteItem("University");
		stationList.listItems();
 		
		System.out.println("-----S T A C K  T E S T------");

		//QRunTestMethod
		System.out.println("\nTesting Queue:");
		queue.enQueue("Bus 1");
		queue.enQueue("Bus 2");
		queue.enQueue("Bus 3");
		queue.enQueue("Bus 4");
		System.out.println("Queue contents:");
		queue.display();
		System.out.println("Dequeuing: " + queue.deQueue());
		System.out.println("Peek at front: " + queue.peek());
	 
		System.out.println("----Q U E U E  T E S T-------");
		
		//StackRunTestMethod
		System.out.println("\nTesting Stack:");
		stack.push("Route 1");
		stack.push("Route 2");
		stack.push("Route 3");
		stack.push("Route 4");
		System.out.println("Stack contents:");
		stack.display();
		System.out.println("Popping: " + stack.pop());
		System.out.println("Peek at top: " + stack.peek());
	}

}
