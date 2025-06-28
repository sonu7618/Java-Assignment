/* Design a program that simulates a supermarket queue management system using an array-based implementation of a queue. 
The system should allow customers to join the queue, get served, and exit the queue. Implement the following functionalities:
a. Add a customer to the queue.
b. Serve the next customer in the queue.
c. Display the current queue.
d. Display the number of customers in the queue.
e. Exit the program */

import java.util.Scanner;

public class SuperMarketQueue {
    String[] queue;
    int front;
    int rear;
    int capacity;
    int size;

    public SuperMarketQueue(int size) {
        queue = new String[size];
        capacity = size;
        front = -1;
        rear = -1;
        this.size = 0;
    }

    public void addCustomer(String customerName) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot add customer: " + customerName);
            return;
        }
        if (size == 0) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = customerName;
        size++;
        System.out.println(customerName + " has joined the queue.");
    }

    public void serveCustomer() {
        if (size == 0) {
            System.out.println("Queue is empty. No customer to serve.");
            return;
        }
        System.out.println(queue[front] + " has been served and removed from the queue.");
        front = (front + 1) % capacity;
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
    }

    public void displayQueue() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Current queue:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + queue[(front + i) % capacity]);
        }
    }

    public void displayQueueSize() {
        System.out.println("Number of customers in the queue: " + size);
    }
}

class UsingSuperMarketQueue {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        SuperMarketQueue queue = new SuperMarketQueue(5);

        while (true) {
            System.out.println("\n--- Supermarket Queue Management ---");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve next customer");
            System.out.println("3. Display current queue");
            System.out.println("4. Display number of customers in queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    queue.addCustomer(name);
                    break;
                case 2:
                    queue.serveCustomer();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    queue.displayQueueSize();
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
