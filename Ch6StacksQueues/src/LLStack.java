public class LLStack {
    LinkedList linkedList;

    public LLStack() {
        linkedList = new LinkedList();
    }

    // Push Method
    public void push(int value) { // Time Complexity O(1)
        linkedList.insertInLinkedList(value, 0); // O(1)
        System.out.println(value + " has been inserted!"); // O(1)
    }

    // IsEmpty Method
    public boolean isEmpty() {
        return linkedList.head == null;
    }
}
