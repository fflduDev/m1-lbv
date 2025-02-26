package stack; 

public class StackImpl implements Stack {

	private String[] stackArray;
	private int top;
	private int capacity;

	public StackImpl(){
		capacity = 10;
		stackArray = new String[capacity];
		top = -1; //Minus because of indexing starting at 0 
	}
	
	@Override
	public void push(String s) {
		if (isFull()){
			stackArray[++top] = s; 
			System.out.println("Item added to stack: " + s);
		}
		else{
			System.out.println("Stack is full");
		}
		
		System.out.println("thing i added to stack: " + s);
	
	}

	@Override
	public String pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		String item = stackArray[top];
		stackArray[top] = null;
		top--;
		System.out.println("Item removed from stack: " + item);
		return item;
	}

	@Override
	public Boolean isEmpty() {
		return top == -1;
	}

	@Override
	public Boolean isFull() {
		return top == capacity -1;
	}

	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public String peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		return stackArray[top]; 
	}

	@Override
	public void setCapacity(int size) {
		if (size > capacity) {
			String[] newArray = new String[size];
			System.arraycopy(stackArray, 0, newArray, 0, capacity);
			stackArray = newArray;
			capacity = size;
		} else {
			System.out.println("New capacity must be larger than current capacity");
		}
	}

	@Override
	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Stack elements:");
		for (int i = top; i >= 0; i--) {
			System.out.println(stackArray[i]);
		}
	}
 

}
