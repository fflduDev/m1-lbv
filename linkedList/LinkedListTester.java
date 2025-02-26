package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		LinkedList tester = new LinkedListImpl();
		
		// Test adding items and listing
		System.out.println("=== Testing addItem and listItems ===");
		tester.addItem("Apple");
		tester.addItem("Banana");
		tester.addItem("Cherry");
		System.out.println("Current list:");
		tester.listItems();
		System.out.println("Item count: " + tester.itemCount());
		
		// Test isItemInList
		System.out.println("\n=== Testing isItemInList ===");
		System.out.println("Is 'Banana' in list? " + tester.isItemInList("Banana"));
		System.out.println("Is 'Orange' in list? " + tester.isItemInList("Orange"));
		
		// Test insertBefore
		System.out.println("\n=== Testing insertBefore ===");
		tester.insertBefore("Apricot", "Banana");
		System.out.println("After inserting 'Apricot' before 'Banana':");
		tester.listItems();
		
		// Test insertAfter
		System.out.println("\n=== Testing insertAfter ===");
		tester.insertAfter("Blueberry", "Banana");
		System.out.println("After inserting 'Blueberry' after 'Banana':");
		tester.listItems();
		
		// Test sort
		System.out.println("\n=== Testing sort ===");
		tester.sort();
		System.out.println("After sorting:");
		tester.listItems();
		
		// Test deleteItem
		System.out.println("\n=== Testing deleteItem ===");
		System.out.println("Deleting 'Banana': " + tester.deleteItem("Banana"));
		System.out.println("After deletion:");
		tester.listItems();
		System.out.println("Trying to delete non-existent item 'Orange': " + 
						  tester.deleteItem("Orange"));
		
		// Test edge cases
		System.out.println("\n=== Testing edge cases ===");
		LinkedList emptyList = new LinkedListImpl();
		System.out.println("Empty list count: " + emptyList.itemCount());
		System.out.println("Try delete from empty list: " + 
						  emptyList.deleteItem("anything"));
		System.out.println("Try insertBefore in empty list: " + 
						  emptyList.insertBefore("new", "nothing"));
		System.out.println("Try insertAfter in empty list: " + 
						  emptyList.insertAfter("new", "nothing"));
		
		// Test null handling
		System.out.println("\n=== Testing null handling ===");
		System.out.println("Try adding null: " + tester.addItem(null));
		
		// Final state
		System.out.println("\n=== Final list state ===");
		System.out.println("Item count: " + tester.itemCount());
		tester.listItems();
	}

}
