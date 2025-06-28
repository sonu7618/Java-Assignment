/* As a software developer, you have been assigned a task to implement a stack data 
structure in Java. Your goal is to create a Java class named Stack.java that represents a stack using a array. Implement the following operations:
push(int element): Adds an integer value element to the top of the stack.
pop(): Removes and returns the element at the top of the stack.
peek(): Returns the element at the top of the stack without removing it.
isEmpty(): Checks if the stack is empty and returns a boolean value indicating the result.
size(): Returns the number of elements currently in the stack.
Your task is to write the Stack.java class and provide the necessary implementation for these operations using a array as the underlying data 
structure. Ensure that the stack follows the last-in, first-out (LIFO) principle.
*/

public class Stack{
    int[] stack;
    int capacity;
    int top;

    public Stack(int size){
        stack = new int[size];
        capacity = size;
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity-1;
    }
     public int size() {
        return top + 1;
    }
    public void push(int value){
        if (isFull()){
            System.out.println("Stack overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " added to stack");
        }
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack underflow");
            return -999999;
        }
        int value = stack[top];
        top--;
        return value;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack underflow");
            return -999999;
        }
        return stack[top];
    }
}

class UsingStack{
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(1);
        myStack.push(10);
        myStack.push(5);

        System.out.println("Top element is: " + myStack.peek());
        System.out.println("Stack size is: " + myStack.size());

        myStack.pop();
        myStack.pop();

        System.out.println("Stack empty: " + myStack.isEmpty());

        myStack.pop();
        myStack.pop();
    }
}
