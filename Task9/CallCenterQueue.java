/* Implement a call center queue using an array-based implementation of a queue. The program should allow call center agents to handle incoming 
calls in a fair manner. Implement the following functionalities:
a. Add an incoming call to the queue.
b. Serve and handle the next call in the queue.
c. Display the current call queue.
d. Display the number of pending calls.
e. Exit the program. */

import java.util.Scanner;

public class CallCenterQueue {
    String[] queue;
    int front;
    int rear;
    int capacity;
    int size;

    public CallCenterQueue(int size) {
        queue = new String[size];
        capacity = size;
        front = -1;
        rear = -1;
        this.size = 0;
    }

    public void addIncomingCall(String caller) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot add call from: " + caller);
            return;
        }
        if (size == 0) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = caller;
        size++;
        System.out.println("Incoming call from " + caller + " has been added to the queue.");
    }

    public void handleNextCall() {
        if (size == 0) {
            System.out.println("Queue is empty. No calls to handle.");
            return;
        }
        System.out.println("Handling call from: " + queue[front]);
        front = (front + 1) % capacity;
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
    }

    public void displayQueue() {
        if (size == 0) {
            System.out.println("Call queue is empty.");
            return;
        }
        System.out.println("Current call queue:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + queue[(front + i) % capacity]);
        }
    }

    public void displayPendingCalls() {
        System.out.println("Number of pending calls: " + size);
    }
}

class UsingCallCenterQueue{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CallCenterQueue callQueue = new CallCenterQueue(5);

        while (true) {
            System.out.println("\n--- Call Center Queue Management ---");
            System.out.println("1. Add incoming call");
            System.out.println("2. Handle next call");
            System.out.println("3. Display current call queue");
            System.out.println("4. Display number of pending calls");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter caller name or number: ");
                    String caller = scanner.nextLine();
                    callQueue.addIncomingCall(caller);
                    break;
                case 2:
                    callQueue.handleNextCall();
                    break;
                case 3:
                    callQueue.displayQueue();
                    break;
                case 4:
                    callQueue.displayPendingCalls();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
