package stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stackTester = new StackImpl();
		stackTester.push("thing in stack");

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
