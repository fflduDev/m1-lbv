package linkedList;

public class LinkedListImpl implements LinkedList {

	private class Node {
		String data;
		Node next;	

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;

	@Override
	public Boolean isItemInList(String thisItem) {
		Node current = head;
		while (current != null) {
			if (current.data.equals(thisItem)) {
				return true;
			}
			current = current.next;
		}
		return false;
	} //test commit

	@Override
	public Boolean addItem(String thisItem) {
		if (thisItem == null) {
			return false;
		}
		System.out.println("hello from addItem in LinkedListImpl - the item passed in: " + thisItem);
		Node newNode = new Node(thisItem);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		return true;
	}

	@Override
	public Integer itemCount() {
		int count =0;
		Node current = head; 
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	@Override
	public void listItems() {
		Node current = head;
		while (current != null){ 
			System.out.println(current.data);
			current = current.next;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		if (head == null){
			return false;
		}
		if (head.data.equals(thisItem)){
			head = head.next;
			return true;
		}
		Node current = head;
		while (current.next != null && !current.next.data.equals(thisItem)){
			current = current.next;
		}
		if (current.next == null){
			return false;	
		}
		current.next = current.next.next;
		return true;
		// TODO Auto-generated method stub
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		if (head == null){
			return false;
		}
		if (head.data.equals(itemToInsertBefore)){
			Node newNode = new Node(newItem);
			newNode.next = head;
			head = newNode;
			return true;
		}
		Node current = head;
		while (current.next != null && !current.next.data.equals(itemToInsertBefore)){
			current = current.next;
		}
		if (current.next == null){
			return false;
		}
		Node newNode = new Node(newItem);
		newNode.next = current.next;
		current.next = newNode;
		return true;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		Node current = head; 
		while (current != null){
			if (current.data.equals(itemToInsertAfter)){
				Node newNode = new Node(newItem);
				newNode.next = current.next;
				current.next = newNode;
				return true;
			}
			current = current.next;
		}
		return false;
		// TODO Auto-generated method stub
	}

	@Override
	public void sort() {
		if (head == null || head.next == null){
			return;
		}
		Node current = head;
		Node index = null; 
		String temp; 
		while (current != null){
			index = current.next;
			while (index != null){
				if (current.data.compareTo(index.data) > 0){
					temp = current.data;
					current.data = index.data;
					index.data = temp;
				}
				index = index.next;
			}
			current = current.next;
		}
		// TODO Auto-generated method stub
	}
	
}
