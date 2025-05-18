package Stack_And_Queue.Learning;

public class stack_using_array {

    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public stack_using_array(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Push operation
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow: Cannot push " + data);
            return;
        }
        stack[++top] = data;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop from empty stack");
            return -1;
        }
        return stack[top--];
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty: Cannot peek");
            return -1;
        }
        return stack[top];
    }

    // Display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack Elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the stack
    public static void main(String[] args) {
        stack_using_array stack = new stack_using_array(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Should print: 10 20 30

        System.out.println("Top element: " + stack.peek()); // Should print: 30

        stack.pop(); // Removes 30
        stack.display(); // Should print: 10 20

        stack.pop();
        stack.pop();
        stack.pop(); // Will show underflow

        stack.push(100);
        stack.display(); // Should print: 100
    }
}
