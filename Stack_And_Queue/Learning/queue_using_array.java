package Stack_And_Queue.Learning;


public class queue_using_array {
    private int[] queue;
    private int size;
    private int front;
    private int rear;

    // Constructor to initialize the queue
    public queue_using_array(int capacity) {
        size = capacity;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Enqueue operation
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        queue[++rear] = data;
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front++];
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    // Get queue capacity
    public int capacity() {
        return size;
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        queue_using_array obj = new queue_using_array(5);

        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);

        obj.display();

        obj.dequeue();
        obj.display();

        System.out.println("Front element: " + obj.peek());
        System.out.println("Queue capacity: " + obj.capacity());
        System.out.println("Is Empty? " + obj.isEmpty());
        System.out.println("Is Full? " + obj.isFull());
    }
}
