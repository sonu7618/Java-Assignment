/* You are tasked with implementing a stack data structure in Java without using any built-in libraries. 
Your goal is to create a CustomStack class that can handle various operations. The class should have the following functionalities:
push(int val): Adds an integer value val to the top of the stack.
pop(): Removes and returns the element at the top of the stack.
peek(): Returns the element at the top of the stack without removing it.

isEmpty(): Checks if the stack is empty and returns a boolean value indicating the result.
isFull(): Checks if the stack is full and returns a boolean value indicating the result. */

public class CustomStack {
    int[] stack;
    int capacity;
    int top;

    public CustomStack(int size){
        stack = new int[size];
        capacity = size;
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow. Cannot push " + value);
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Cannot pop.");
            return -1; // indicates underflow
        } else {
            int poppedValue = stack[top];
            top--;
            System.out.println(poppedValue + " popped from stack.");
            return poppedValue;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        } else {
            return stack[top];
        }
    }

}

class UsingCustomStack{
    public static void main(String[] args) {
        CustomStack myStack = new CustomStack(3);

        myStack.push(5);
        myStack.push(10);
        myStack.push(15);
        myStack.push(20);

        System.out.println("Top element is: " + myStack.peek());

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
    }
}
