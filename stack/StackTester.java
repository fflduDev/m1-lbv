package stack;

public class StackTester {

	public static void main(String[] args) {
		Stack stack = new StackImpl();
		
		// Test initial state
		System.out.println("=== Testing Initial State ===");
		System.out.println("Is empty? " + stack.isEmpty());
		System.out.println("Is full? " + stack.isFull());
		System.out.println("Size: " + stack.size());
		
		// Test push operation
		System.out.println("\n=== Testing Push Operation ===");
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		System.out.println("After pushing 3 items:");
		stack.display();
		System.out.println("Current size: " + stack.size());
		
		// Test peek operation
		System.out.println("\n=== Testing Peek Operation ===");
		System.out.println("Peek at top item: " + stack.peek());
		System.out.println("Size after peek: " + stack.size());
		
		// Test pop operation
		System.out.println("\n=== Testing Pop Operation ===");
		System.out.println("Popped item: " + stack.pop());
		System.out.println("After popping one item:");
		stack.display();
		
		// Test setCapacity
		System.out.println("\n=== Testing setCapacity ===");
		stack.setCapacity(15);
		System.out.println("After increasing capacity to 15");
		// Try to set smaller capacity
		stack.setCapacity(5);
		
		// Test stack full condition
		System.out.println("\n=== Testing Stack Full Condition ===");
		for (int i = 0; i < 12; i++) {
			stack.push("Item" + i);
		}
		System.out.println("Is full? " + stack.isFull());
		
		// Test empty stack operations
		System.out.println("\n=== Testing Empty Stack Operations ===");
		Stack emptyStack = new StackImpl();
		System.out.println("Pop from empty stack: " + emptyStack.pop());
		System.out.println("Peek at empty stack: " + emptyStack.peek());
		System.out.println("Display empty stack:");
		emptyStack.display();
		
		// Test clearing the stack
		System.out.println("\n=== Testing Clearing Stack ===");
		while (!stack.isEmpty()) {
			stack.pop();
		}
		System.out.println("After clearing stack:");
		System.out.println("Is empty? " + stack.isEmpty());
		System.out.println("Size: " + stack.size());
		stack.display();
	}
	
	public static void runTests(Stack stack) {
	 	stack.setCapacity(6);

		 stack.push("RockA");
		 stack.push("RockB");
		 stack.push("RockC");
		 stack.push("RockD");
		 stack.push("RockE");
		 stack.push("RockF");

	}
}
