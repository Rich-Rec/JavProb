public class Main {

    public static void main(String[] args) {
        Stack newStack = new Stack(4);

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        newStack.pop();
        newStack.pop();
        newStack.push(5);
        System.out.println(newStack.peek());

        System.out.println(newStack.isEmpty());
        System.out.println(newStack.isFUll());
        newStack.deleteStack();

        // Linked List Stack
        LLStack newStack00 = new LLStack();
        newStack00.push(1);
        newStack00.push(2);
        newStack00.push(3);

        System.out.println(newStack00.isEmpty());
    }
}