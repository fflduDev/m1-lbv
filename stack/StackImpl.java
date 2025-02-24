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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCapacity(int size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
 

}
