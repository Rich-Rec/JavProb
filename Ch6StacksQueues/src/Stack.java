public class Stack {
    int[] arr;
    int stackTop;

    public Stack(int size) { // Space Complexity for stack creation is //O(N)
        this.arr = new int[size]; //O(1)
        this.stackTop = -1; //O(1)
        System.out.println("This stack is created with size: "+ size); //O(1)
    }
    // isEmpty
    public boolean isEmpty() { // Space Complexity 0(1)
        return (stackTop == -1); // O(1)
    }
    // isFull
    public boolean isFUll() { // Space Complexity O(1)
        return (stackTop == arr.length-1); // O(1)
    }
    // Push
    public void push(int value) { // Space Complexity O(1)
        // Check if stack is full
        if(isFUll()) { // O(1)
            System.out.println("The stack is full! " + value + " was not added!"); // O(1)
        } else {
            arr[stackTop + 1] = value; // O(1)
            stackTop++; // O(1)
            System.out.println(value + " has been added!"); // O(1)
        }
    }
    // Pop
    public int pop() { // Space Complexity O(1)
        if(isEmpty()) { // O(1)
            System.out.println("This stack is empty!");
            return -1;
        } else {
            int topStack = arr[stackTop]; // O(1)
            stackTop--; // O(1)
            System.out.println(topStack + " has been successfully removed"); // O(1)
            return topStack; // O(1)
        }
    }
    // Peek Method
    public int peek() { // Space Complexity O(1)
        if(isEmpty()) { // O(1)
            System.out.println("The Stack is empty!"); // O(1)
            return -1; // O(1)
        } else {
            return arr[stackTop]; // O(1)
        }
    }
    // Delete Method
    public void deleteStack() { // Space Complexity O(1)
        arr = null; // O(1)
        System.out.println("Stack successfully deleted!"); // O(1)
    }
}
